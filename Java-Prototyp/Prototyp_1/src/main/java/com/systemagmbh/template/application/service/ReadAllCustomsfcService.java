package com.systemagmbh.template.application.service;

import com.systemagmbh.template.application.port.inbound.ReadAllCustomsfcPort;
import com.systemagmbh.template.application.port.outbound.CustomsfcRepositoryPort;
import com.systemagmbh.template.application.response.CustomsfcDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ReadAllCustomsfcService implements ReadAllCustomsfcPort {

    private final CustomsfcRepositoryPort customsfcRepository;

    @Override
    public CustomsfcDataResponse readAllCustomsfc(){

        var customsfcs = customsfcRepository.findAllCustomsfc();
        var response = new CustomsfcDataResponse();

        response.setCustomsfcDataDto(customsfcs);

        return response;

    }

}
