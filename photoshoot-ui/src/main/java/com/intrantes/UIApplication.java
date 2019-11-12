package com.intrantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lime
 * @description
 * @date 2018/3/30
 **/
@EnableDiscoveryClient
@SpringBootApplication()
public class UIApplication {
    public static void main(String[] args) {
        SpringApplication.run(UIApplication.class, args);
    }

}
