package com.magic;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.magic.system.mapper")
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("swagger:http://localhost:8080/swagger-ui/index.html");
        SpringApplication.run(Application.class, args);
    }

}
