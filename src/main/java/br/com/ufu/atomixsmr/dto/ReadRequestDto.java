package br.com.ufu.atomixsmr.dto;

import java.time.LocalDateTime;

public class ReadRequestDto {

    public LocalDateTime createdAt;

    public ReadRequestDto(
        LocalDateTime createdAt
    ) {
        this.createdAt = createdAt;
    }
}
