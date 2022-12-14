package com.example.behavior.template;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * SQL语句抽象，提供基于命名参数的SQL语句功能
 *
 * @author Simon(ZhangXi)
 */
public final class NSQL {

    // 静态集合缓存使用过的NSQL
    private static Map<String, NSQL> caches = new ConcurrentHashMap<String, NSQL>();

    private String sql_naming;
    private String sql_execute;
    private String[] names;

    private NSQL() {
        // 用户不能实例化对象
        // 通过get方法获取可用实例
    }

    public boolean hasName() {
        return names.length > 0;
    }

    public void setParameter(PreparedStatement ps, String name, Object value) throws SQLException {
        for (int a = 0, b = names.length - 1; a <= b; a++, b--) {
            if (names[a].equals(name)) {
                ps.setObject(a + 1, value);
            }
            if (a != b && names[b].equals(name)) {
                ps.setObject(b + 1, value);
            }
        }
    }

    public void setParameters(PreparedStatement ps, Map<String, NSQL> values) throws SQLException {
        for (int index = 0; index < names.length; index++) {
            ps.setObject(index + 1, values.get(names[index]));
        }
    }

    /**
     * 获取参数名
     *
     * @return
     */
    public String[] getParameterNames() {
        return this.names;
    }

    /**
     * 获取用于数据库执行的SQL语句
     *
     * @return
     */
    public String getSql() {
        return sql_execute;
    }

    /**
     * 获取用户定义的命名SQL语句
     *
     * @return
     */
    public String getNamingSql() {
        return sql_naming;
    }

    /**
     * 获取对象实例，此方法将缓存分析过的SQL语句以提高性能
     *
     * @param sql
     * @return
     */
    public static NSQL get(String sql) {
        NSQL nsql = caches.get(sql);
        if (nsql == null) {
            nsql = NSQL.parse(sql);
            caches.put(sql, nsql);
        }
        return nsql;
    }

    /**
     * 分析命名SQL语句获取抽象NSQl实例；java(JDBC)提供SQL语句命名参数而是通过?标识参数位置，
     * 通过此对象可以命名参数方式使用SQL语句，命名参数以?开始后跟名称?name。
     * 例如：SELECT * FROM table WHERE name = ?key AND email = ?key;
     *
     * @param sql
     * @return
     */
    public static NSQL parse(String sql) {
        // SELECT * FROM table WHERE name = ?key AND email = ?key;
        // A~Z a~z 01~9 _
        if (sql == null){
			throw new NullPointerException("SQL String is null");
		}
        char c;
        List<String> names = new ArrayList<>();
        StringBuilder sql_builder = new StringBuilder();
        StringBuilder name_builder = new StringBuilder();
        for (int index = 0; index < sql.length(); index++) {
            c = sql.charAt(index);
            sql_builder.append(':' == c ? '?' : c);
            if (':' == c) {
                while (++index < sql.length()) {
                    c = sql.charAt(index);
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_' || (c >= '0' && c <= '9')) {
                        name_builder.append(c);
                    } else {
                        sql_builder.append(c);
                        break;
                    }
                }
                names.add(name_builder.toString());
                name_builder.setLength(0);
            }
        }
        NSQL dbsql = new NSQL();
        dbsql.sql_naming = sql;
        dbsql.sql_execute = sql_builder.toString();
        dbsql.names = names.toArray(dbsql.names = new String[names.size()]);
        return dbsql;
    }

    @Override
	public String toString() {
        return "NAMING: " + sql_naming + "\nEXECUTE: " + sql_execute;
    }
}
