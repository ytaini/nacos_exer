package cn.zwng.microservice.serviceimpl;

import cn.zwng.microservice.api.Service02Provider;
import org.springframework.stereotype.Component;

@Component
@org.apache.dubbo.config.annotation.Service
public class Service02ProviderImpl implements Service02Provider {
    @Override
    public String server() {
        return "service02";
    }
}
