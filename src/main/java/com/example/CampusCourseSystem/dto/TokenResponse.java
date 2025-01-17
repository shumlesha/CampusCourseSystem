package com.example.CampusCourseSystem.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenResponse {
    private UUID id;

    private String email;

    private String accessToken;

    private String refreshToken;

}
