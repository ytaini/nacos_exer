package cn.zwng.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class Server1Main {

    public static void main(String[] args) {
        SpringApplication.run(Server1Main.class,args);
    }

    @Value("${server1.name}")
    private String config;

    @GetMapping("/server1")
    public String server(){
        return config;
    }

 /*

    方式二：
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/server1")
    public String server(){
        return applicationContext.getEnvironment().getProperty("server1.name");
    }
*/

}
