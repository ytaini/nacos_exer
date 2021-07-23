package cn.zwng.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service01Main3000 {
    public static void main(String[] args) {
        SpringApplication.run(Service01Main3000.class,args);
    }
}
