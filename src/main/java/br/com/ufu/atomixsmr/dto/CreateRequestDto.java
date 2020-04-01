package br.com.ufu.atomixsmr.dto;

import br.com.ufu.atomixsmr.entity.Request;

import java.time.LocalDateTime;

public class CreateRequestDto {

    public LocalDateTime createdAt;

    public CreateRequestDto(
            LocalDateTime createdAt
    ) {
        this.createdAt = createdAt;
    }

    public Request toEntity() {
        return new Request(
            this.createdAt
        );
    }
}
