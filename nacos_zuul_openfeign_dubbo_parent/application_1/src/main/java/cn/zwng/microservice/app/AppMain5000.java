package cn.zwng.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppMain5000 {
    public static void main(String[] args) {
        SpringApplication.run(AppMain5000.class,args);
    }
}
