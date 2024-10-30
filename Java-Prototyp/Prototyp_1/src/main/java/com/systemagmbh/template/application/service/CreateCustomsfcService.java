package com.systemagmbh.template.application.service;

import com.systemagmbh.template.adapter.out.jpa.dbo.CustomsfcDbo;
import com.systemagmbh.template.application.port.inbound.CreateCustomsfcPort;
import com.systemagmbh.template.application.port.outbound.CustomsfcRepositoryPort;
import com.systemagmbh.template.application.request.CreateCustomsfcRequest;
import com.systemagmbh.template.application.response.dto.CustomsfcDto;
import com.systemagmbh.template.domain.Customsfc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class CreateCustomsfcService implements CreateCustomsfcPort {

    private final CustomsfcRepositoryPort customsfcRepository;

    @Override
    public void createCustomsfc(CreateCustomsfcRequest createCustomsfcRequest){

        CustomsfcDto customsfcDto = new CustomsfcDto();
        customsfcDto.setSfc(createCustomsfcRequest.getSfc());
        customsfcDto.setPlant(createCustomsfcRequest.getPlant());
        customsfcDto.setDataField(createCustomsfcRequest.getDataField());
        customsfcDto.setDataFieldValue(createCustomsfcRequest.getDataFieldValue());

        Optional<CustomsfcDbo> existingCustomsfc = Optional.ofNullable(customsfcRepository.findSfcByKeyData(customsfcDto));

        if (existingCustomsfc.isEmpty()){

            Customsfc customsfc = new Customsfc();

            customsfc.setSfc(createCustomsfcRequest.getSfc());
            customsfc.setPlant(createCustomsfcRequest.getPlant());
            customsfc.setDataField(createCustomsfcRequest.getDataField());
            customsfc.setDataFieldValue(createCustomsfcRequest.getDataFieldValue());

            customsfcRepository.save(customsfc);
        }

    }
}
