package com.patecan.messagereceiver.model;

import com.patecan.messagereceiver.model.message_reveived_event.MessageDto;
import com.patecan.messagereceiver.model.message_reveived_event.RecipientDto;
import com.patecan.messagereceiver.model.message_reveived_event.SenderDto;

public record MessageReceivedEventDto(
        String app_id,
        String user_id_by_app,
        String event_name,
        String timestamp,
        SenderDto sender,
        RecipientDto recipient,
        MessageDto message
) {}




