package com.axing.springboot_dubbo_consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubbo
public class SpringbootDubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootDubboConsumerApplication.class, args);
        DubboConsumerServiceImpl dubboConsumerService = run.getBean(DubboConsumerServiceImpl.class);
        dubboConsumerService.print();
    }

}

