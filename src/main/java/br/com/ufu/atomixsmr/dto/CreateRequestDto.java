package br.com.ufu.atomixsmr.dto;

import br.com.ufu.atomixsmr.entity.Request;

import javax.validation.constraints.NotEmpty;

public class CreateRequestDto {

    @NotEmpty
    public String createdAt;

    public CreateRequestDto() {

    }

    public CreateRequestDto(
        String createdAt
    ) {
        this.createdAt = createdAt;
    }

    public Request toEntity() {
        return new Request(
            this.createdAt
        );
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
