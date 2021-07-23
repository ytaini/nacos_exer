package cn.zwng.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayMain80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayMain80.class,args);
    }
}
