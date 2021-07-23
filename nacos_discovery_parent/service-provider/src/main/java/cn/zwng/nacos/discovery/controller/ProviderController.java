package cn.zwng.nacos.discovery.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    String port;

    @GetMapping("/provider/service")
    public String server(){
        return "provider/service~~" + port;
    }
}
