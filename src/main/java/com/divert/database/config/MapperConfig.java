package com.divert.database.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.divert.database")
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}