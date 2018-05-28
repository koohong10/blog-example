package com.example.oauth.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.h2.tools.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;


//@Profile("local") for local
@Configuration
public class H2ServerConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource")
    // yml의 설정값을 Set한다.
    public DataSource dataSource() throws SQLException {
        Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }


}