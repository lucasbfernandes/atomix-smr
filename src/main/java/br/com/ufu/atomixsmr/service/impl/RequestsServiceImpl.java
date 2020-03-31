package br.com.ufu.atomixsmr.service.impl;

import br.com.ufu.atomixsmr.dto.ReadRequestDto;
import br.com.ufu.atomixsmr.service.RequestsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestsServiceImpl implements RequestsService {

    public List<ReadRequestDto> getRequests() {
        return List.of();
    }
}
