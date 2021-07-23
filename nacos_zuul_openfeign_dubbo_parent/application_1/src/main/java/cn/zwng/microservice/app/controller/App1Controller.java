package cn.zwng.microservice.app.controller;

import cn.zwng.microservice.api.Service01Provider;
import cn.zwng.microservice.api.Service02Provider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    //注入基于Dubbo协议的Service
    @org.apache.dubbo.config.annotation.Reference
    private Service01Provider service01Provider;

    @org.apache.dubbo.config.annotation.Reference
    private Service02Provider service02Provider;

    @Value("${server.port}")
    private String port;

    @GetMapping("/server")
    public String server() {
        return "app1" + service01Provider.service() + service02Provider.server() + port;
    }
}
