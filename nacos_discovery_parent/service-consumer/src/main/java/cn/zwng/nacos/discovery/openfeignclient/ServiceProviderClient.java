package cn.zwng.nacos.discovery.openfeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-provider")
public interface ServiceProviderClient {
    @GetMapping("/provider/service")
    public String server();
}
