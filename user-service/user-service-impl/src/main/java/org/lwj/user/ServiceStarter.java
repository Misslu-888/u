package org.lwj.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ServiceStarter {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStarter.class, args);
    }


}
