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
        String response = interpreterAgentClient.sendMessageToAIAgent(id, message);
        return response;
    }
}
