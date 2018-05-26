package com.xingjiejian.demo.springboot.phoneinfo.configurer;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Xing.Jiejian
 */
@Configuration
public class DataSourceConfigurer {
    @Bean
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
