package world.xuewei.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"world.xuewei.fast", "world.xuewei.demo"})
@SpringBootApplication
public class XwFastDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwFastDemoApplication.class, args);
    }

}
