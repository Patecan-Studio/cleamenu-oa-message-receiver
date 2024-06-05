package com.patecan.messagereceiver.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/receiver")
public class MessageReceiverController {
    Logger logger = LoggerFactory.getLogger(MessageReceiverController.class);



    @PostMapping("/oa/message")
    public ResponseEntity<String> listenNewMessage(@RequestBody String payload) {
        logger.info(payload);
        System.out.println(payload);
        return ResponseEntity.ok(payload);
    }

}
