package com.konoha.ninja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NinjaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NinjaServiceApplication.class, args);
    }
}