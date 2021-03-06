package cn.zwng.nacos;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@SpringBootApplication
public class Server2Main {
    public static void main(String[] args) {
        SpringApplication.run(Server2Main.class,args);
    }


    @Value("${server2.name}")
    private String config;

    @GetMapping("/server2")
    public String server(){
        return config;
    }

    /**
     * test idea git
     */
    // github 上修改了一次代码
}
