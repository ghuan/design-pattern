package com.example.behavior.template;

/**
 * mysql jdbc实现类
 *
 * @author tianma
 * @date 2022/ 10/09 10:49:08
 */
public class MysqlJdbc extends JdbcTemplate {

    public MysqlJdbc(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    void loadDriverClass() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }
}
