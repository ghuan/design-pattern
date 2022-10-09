package com.example.behavior.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 测试
 * @author tianma
 * @date 2022/ 09/20 17:50:35
 */
public class Test {
    public static void main(String[] args){
        JdbcTemplate mysqlJdbc = new MysqlJdbc("jdbc:mysql://192.168.3.103:3306/msf-boot","root","123456");
        List<Map<String,Object>> list1 =  mysqlJdbc.doSqlQuery("select 1 as test",null);
        int n1 = mysqlJdbc.executeSql("update sys_org set org_code =:org_code_new where org_code = :org_code",new HashMap<String,Object>(){{
            put("org_code","111");
            put("org_code","222");
        }});
    }
}
