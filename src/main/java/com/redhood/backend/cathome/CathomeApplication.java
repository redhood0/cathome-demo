package com.redhood.backend.cathome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan({"com.redhood.backend.cathome.mapper","com.redhood.backend.cathome.mp_generator.c.mapper"})
@ServletComponentScan("com.redhood.backend.cathome.filter")
public class CathomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CathomeApplication.class, args);
    }

}
