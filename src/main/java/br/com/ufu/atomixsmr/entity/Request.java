package br.com.ufu.atomixsmr.entity;

import br.com.ufu.atomixsmr.dto.ReadRequestDto;

import java.time.LocalDateTime;

public class Request {

    public LocalDateTime createdAt;

    public Request(
        LocalDateTime createdAt
    ) {
        this.createdAt = createdAt;
    }

    public ReadRequestDto toReadDto() {
        return new ReadRequestDto(
            this.createdAt
        );
    }
}
