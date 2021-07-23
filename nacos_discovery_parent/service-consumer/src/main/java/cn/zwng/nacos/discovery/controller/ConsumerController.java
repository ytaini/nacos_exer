package cn.zwng.nacos.discovery.controller;

import cn.zwng.nacos.discovery.openfeignclient.ServiceProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @Autowired
    private ServiceProviderClient serviceProviderClient;

    @GetMapping("/consumer/service")
    public String server(){
        return "/consumer/service  |" + serviceProviderClient.server();
    }

}
