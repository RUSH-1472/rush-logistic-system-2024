package com.rush.logistic.client.slack.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SlackUpdateRequestDto {

    private String message;
    private String sendUserId;
    private String receiveUserSlackId;
}
