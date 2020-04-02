package br.com.ufu.atomixsmr.controller;

import br.com.ufu.atomixsmr.dto.CreateRequestDto;
import br.com.ufu.atomixsmr.dto.ReadRequestDto;
import br.com.ufu.atomixsmr.service.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/requests")
public class RequestsController {

    private RequestsService requestsService;

    @Autowired
    public RequestsController(
        RequestsService requestsService
    ) {
        this.requestsService = requestsService;
    }

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<ReadRequestDto> getRequests() {
        return this.requestsService.getRequests();
    }

    @PostMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public ReadRequestDto createRequest(@Valid @RequestBody CreateRequestDto createRequestDto) {
        return this.requestsService.createRequest(createRequestDto);
    }
}
