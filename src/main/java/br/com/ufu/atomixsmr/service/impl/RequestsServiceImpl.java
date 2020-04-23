package br.com.ufu.atomixsmr.service.impl;

import br.com.ufu.atomixsmr.dto.CreateRequestDto;
import br.com.ufu.atomixsmr.dto.ReadRequestDto;
import br.com.ufu.atomixsmr.entity.Request;
import br.com.ufu.atomixsmr.service.RequestsService;
import io.atomix.core.Atomix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestsServiceImpl implements RequestsService {

    private Atomix atomix;

    @Autowired
    public RequestsServiceImpl(
        Atomix atomix
    ) {
        this.atomix = atomix;
    }

    public List<ReadRequestDto> getRequests() {
        final List<Request> requests = this.atomix.getList("requests-list");
        return requests
            .stream()
            .map(Request::toReadDto)
            .collect(Collectors.toList());
    }

    public ReadRequestDto createRequest(CreateRequestDto createRequestDto) {
        final List<Request> requests = this.atomix.getList("requests-list");
        final Request request = createRequestDto.toEntity();

        requests.add(request);
        return request.toReadDto();
    }
}
