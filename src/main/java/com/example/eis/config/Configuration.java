package com.example.eis.config;

import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @org.springframework.context.annotation.Bean

    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("")
                .url("")
                .username("")
                .password("")
                .build();
    }
}