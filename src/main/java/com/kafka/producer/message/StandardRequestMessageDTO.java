package com.kafka.producer.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class StandardRequestMessageDTO {

    private String transactionId;

    private LocalDateTime dateTime;

    @JsonProperty("payLoad")
    private JsonNode payLoad;

}
