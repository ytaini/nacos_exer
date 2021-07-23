package cn.zwng.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service02Main4000 {
    public static void main(String[] args) {
        SpringApplication.run(Service02Main4000.class,args);
    }
}
