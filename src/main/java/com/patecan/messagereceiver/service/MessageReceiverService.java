package com.patecan.messagereceiver.service;

import com.patecan.messagereceiver.api.InterpreterAgentClient;
import com.patecan.messagereceiver.model.message_reveived_event.MessageDto;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiverService {
    private final InterpreterAgentClient interpreterAgentClient;

    public MessageReceiverService(InterpreterAgentClient interpreterAgentClient) {
        this.interpreterAgentClient = interpreterAgentClient;
    }

    public String sendMessageToInterpreterAgent(String id, MessageDto message) {
        String response = interpreterAgentClient.sendMessageToAIAgent("66499d09b313248178294db5", message);
        return response;
    }
}
