package com.patecan.messagereceiver.controllers;


import com.patecan.messagereceiver.api.InterpreterAgentClient;
import com.patecan.messagereceiver.model.MessageReceivedEventDto;
import com.patecan.messagereceiver.service.MessageReceiverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/receiver")
public class MessageReceiverController {
    Logger logger = LoggerFactory.getLogger(MessageReceiverController.class);

    @Autowired
    MessageReceiverService messageReceiverService;

    @PostMapping("/chat")
    public ResponseEntity<String> sendMessageToInterpreterAgent(@RequestBody MessageReceivedEventDto payload) {
        String response = messageReceiverService.sendMessageToInterpreterAgent("66499d09b313248178294db5", payload.message());
        return ResponseEntity.ok(response);
    }


    @PostMapping("/oa/message")
    public ResponseEntity<String> listenNewMessage(@RequestBody MessageReceivedEventDto payload) {
        messageReceiverService.sendMessageToInterpreterAgent(payload.sender().id(), payload.message());
        return ResponseEntity.ok("OK");
    }

}
