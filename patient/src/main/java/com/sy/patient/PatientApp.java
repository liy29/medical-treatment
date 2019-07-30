package com.sy.patient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liying
 * @version 1.0
 * @description
 * @create 2019-07-29 17:01
 */
@SpringBootApplication
@MapperScan("com.sy.patient.mapper")
public class PatientApp {
    public static void main(String[] args) {
        SpringApplication.run(PatientApp.class,args);
    }
}
