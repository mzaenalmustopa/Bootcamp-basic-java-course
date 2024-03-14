package mzaenalmstpa.javadatabase;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil {

    private static HikariDataSource dataSource;
    static {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/java_database");
        config.setUsername("root");
        config.setPassword("P@ssW0rd32!");

        // konfigurasi pool
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setMinimumIdle(60_000);
        config.setMaxLifetime(10 * 60_000);

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource(){
        return dataSource;
    }
}
