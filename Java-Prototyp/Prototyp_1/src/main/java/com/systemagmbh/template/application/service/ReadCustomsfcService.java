package com.systemagmbh.template.application.service;

import com.systemagmbh.template.application.port.inbound.ReadCustomsfcPort;
import com.systemagmbh.template.application.port.outbound.CustomsfcRepositoryPort;
import com.systemagmbh.template.application.request.ReadCustomsfcRequest;
import com.systemagmbh.template.application.response.CustomsfcDataResponse;
import com.systemagmbh.template.application.response.dto.CustomsfcDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@RequiredArgsConstructor
@Service
public class ReadCustomsfcService implements ReadCustomsfcPort {

    private final CustomsfcRepositoryPort customsfcRepository;

    @Override
    public CustomsfcDataResponse readCustomsfc(ReadCustomsfcRequest readCustomsfcRequest){

        CustomsfcDto customsfcDto = new CustomsfcDto();
        customsfcDto.setSfc(readCustomsfcRequest.getSfc());
        customsfcDto.setPlant(readCustomsfcRequest.getPlant());

        var customsfcs = customsfcRepository.findCustomsfcBySfcAndPlant(customsfcDto);
        var response = new CustomsfcDataResponse();

        response.setCustomsfcDataDto(customsfcs);

        return response;

    }
}
