package com.jd.xya.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jd.xya.springbootmybatis.dao") //mybatis 扫描包
public class BootMybatisApp {
    public static void main(String[] args) {

        SpringApplication.run(BootMybatisApp.class, args);
        }
        }
