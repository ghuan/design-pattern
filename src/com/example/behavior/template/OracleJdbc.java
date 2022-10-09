package com.example.behavior.template;

/**
 * oracle jdbc实现类
 *
 * @author tianma
 * @date 2022/ 10/09 10:49:08
 */
public class OracleJdbc extends JdbcTemplate {

    public OracleJdbc(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    void loadDriverClass() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }
}
