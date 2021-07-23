package cn.zwng.microservice.serviceimpl;

import cn.zwng.microservice.api.Service01Provider;
import cn.zwng.microservice.api.Service02Provider;
import org.springframework.stereotype.Component;

@Component
@org.apache.dubbo.config.annotation.Service
public class Service01ProviderImpl implements Service01Provider {

    @org.apache.dubbo.config.annotation.Reference
    private Service02Provider service02Provider;

    @Override
    public String service() {
        return "service01" + service02Provider.server();
    }
}
