package com.springdemo1.app.SpringJavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springdemo1.app.SpringJavaConfiguration")
public class AppConfig {
	@Bean
    public Client client(Service service1) {
        return new ClientImpl(service1);
    }
	@Bean
    public Service getService1() {
        return new ServiceImpl();
    }
}
