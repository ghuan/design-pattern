package com.example.behavior.template;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据库连接jdbc模板
 *
 * @author tianma
 * @date 2022/ 10/09 10:29:30
 */
public abstract class JdbcTemplate {
    abstract void loadDriverClass();
    private Connection connection;
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public JdbcTemplate(String url,String username,String password){
        this.url = url;
        this.username = username;
        this.password = password;
        //加载jdbc驱动类，由子类实现
        loadDriverClass();
        try {
            this.connection = DriverManager.getConnection(this.url, this.username, this.password);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }
    /**
     * @description 手动关闭连接
     * @author tianma
     * @date 2022/10/9 10:36
     **/
    public final void closeConnect(){
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }

    /**
     * @description 查询sql
     * @author tianma
     * @date 2022/10/9 10:45
     **/
    public List<Map<String, Object>> doSqlQuery(String sql, Map<String,Object> params){
        List<Map<String, Object>> list = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ResultSetMetaData ns = null;
        try{
            NSQL nsql = NSQL.get(sql);
            preparedStatement=this.connection.prepareStatement(nsql.getSql());
            //组装入参
            String[] parameterNames = nsql.getParameterNames();
            if(parameterNames != null && parameterNames.length > 0){
                for(String pn : parameterNames){
                    if(params.containsKey(pn)){
                        nsql.setParameter(preparedStatement,pn,params.get(pn));
                    }
                }
            }
            resultSet = preparedStatement.executeQuery();
            ns = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> map = new HashMap<>();
                for (int i = 1; i <= ns.getColumnCount(); i++) {
                    String key = ns.getColumnName(i);
                    int type = ns.getColumnType(i);
                    switch (type){
                        case Types.VARCHAR:
                            map.put(key, resultSet.getString(key));
                            break;
                        case Types.DOUBLE:
                            map.put(key, resultSet.getDouble(key));
                            break;
                        case Types.INTEGER:
                            map.put(key, resultSet.getInt(key));
                            break;
                        case Types.DATE:
                            map.put(key, resultSet.getDate(key));
                            break;
                        case Types.TIMESTAMP:
                            map.put(key, resultSet.getTimestamp(key));
                            break;
                        default:
                            map.put(key, resultSet.getObject(key));
                    }
                }
                list.add(map);
            }
            return list;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e);
        }finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage(),e);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage(),e);
                }
            }
        }
    }

    /**
     * @description 执行sql
     * @author tianma
     * @date 2022/10/9 10:46
     **/
    public int executeSql(String sql,Map<String,Object> params){
        PreparedStatement preparedStatement = null;
        try {
            NSQL nsql = NSQL.get(sql);
            preparedStatement=this.connection.prepareStatement(nsql.getSql());
            //组装入参
            String[] parameterNames = nsql.getParameterNames();
            if(parameterNames != null && parameterNames.length > 0){
                for(String pn : parameterNames){
                    if(params.containsKey(pn)){
                        nsql.setParameter(preparedStatement,pn,params.get(pn));
                    }
                }
            }
            int num = preparedStatement.executeUpdate();
            return num;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        }finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(),e);
            }
        }
    }

}
