package veu_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@MapperScan("veu_demo.dao")
public class
VueDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueDemoApplication.class, args);
    }

}
