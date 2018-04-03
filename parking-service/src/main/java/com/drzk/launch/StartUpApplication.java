package com.drzk.launch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.drzk.*")
@MapperScan("com.drzk.mapper")
@EnableTransactionManagement
@EnableSwagger2
public class StartUpApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class, args);
    }
}
