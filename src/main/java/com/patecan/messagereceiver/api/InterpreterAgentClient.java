package com.patecan.messagereceiver.api;

import com.patecan.messagereceiver.model.MessageReceivedEventDto;
import com.patecan.messagereceiver.model.message_reveived_event.MessageDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "interpreterAgentClient", url = "${interpreter-agent-client.url}")
public interface InterpreterAgentClient {
    @PostMapping(value = "/stores/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    String sendMessageToAIAgent(@PathVariable("id") String id, @RequestBody MessageDto message);

}