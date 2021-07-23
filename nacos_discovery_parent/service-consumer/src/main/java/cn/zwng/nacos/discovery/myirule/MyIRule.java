package cn.zwng.nacos.discovery.myirule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
*
* 修改LB算法。
* */
@Configuration
public class MyIRule {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
