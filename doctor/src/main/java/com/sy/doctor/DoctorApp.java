package com.sy.doctor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liying
 * @version 1.0
 * @description 111
 * @create 2019-07-29 16:58
 */
@SpringBootApplication
@MapperScan("com.sy.doctor.mapper")
public class DoctorApp {
    public static void main(String[] args) {
        SpringApplication.run(DoctorApp.class,args);
    }
}
