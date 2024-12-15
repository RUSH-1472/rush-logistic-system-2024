package com.rush.logistic.client.company_product.global.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private String userId;
    private String username;
    private String password;
    private String slackId;
    private String role;
    private String email;
    private String hubId;
    private String companyId;
    private String deliveryId;
}