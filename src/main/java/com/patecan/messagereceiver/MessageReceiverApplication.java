package com.patecan.messagereceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MessageReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageReceiverApplication.class, args);
    }

}
