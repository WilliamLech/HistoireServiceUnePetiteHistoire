package com.java.histoire;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.java.histoire")
public class HistoireApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HistoireApplication.class, args);
    }

}
