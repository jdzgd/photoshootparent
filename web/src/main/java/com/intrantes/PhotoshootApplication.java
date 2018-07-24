package com.intrantes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lime
 * @description
 * @date 2018/3/30
 **/
@MapperScan("com.intrantes.dao")
@SpringBootApplication()
public class PhotoshootApplication {
    public static void main(String[] args) {
        SpringApplication.run(PhotoshootApplication.class, args);
    }

}
