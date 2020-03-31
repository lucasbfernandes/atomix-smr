package br.com.ufu.atomixsmr.service;

import br.com.ufu.atomixsmr.dto.ReadRequestDto;

import java.util.List;

public interface RequestsService {

    List<ReadRequestDto> getRequests();
}
