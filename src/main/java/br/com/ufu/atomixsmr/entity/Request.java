package br.com.ufu.atomixsmr.entity;

import br.com.ufu.atomixsmr.dto.ReadRequestDto;

public class Request {

    public String createdAt;

    public Request(
        String createdAt
    ) {
        this.createdAt = createdAt;
    }

    public ReadRequestDto toReadDto() {
        return new ReadRequestDto(
            this.createdAt
        );
    }
}
