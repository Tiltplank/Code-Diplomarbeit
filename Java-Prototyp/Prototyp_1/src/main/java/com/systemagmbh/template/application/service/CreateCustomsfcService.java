package com.systemagmbh.template.application.service;

import com.systemagmbh.template.application.port.inbound.CreateCustomsfcPort;
import com.systemagmbh.template.application.port.outbound.CustomsfcRepositoryPort;
import com.systemagmbh.template.application.request.CreateCustomsfcRequest;
import com.systemagmbh.template.domain.Customsfc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CreateCustomsfcService implements CreateCustomsfcPort {

    private final CustomsfcRepositoryPort customsfcRepository;

    @Override
    public void createCustomsfc(CreateCustomsfcRequest createCustomsfcRequest){

        Customsfc customsfc = new Customsfc();

        customsfc.setSfc(createCustomsfcRequest.getSfc());
        customsfc.setPlant(createCustomsfcRequest.getPlant());
        customsfc.setDataField(createCustomsfcRequest.getDataField());
        customsfc.setDataFieldValue(createCustomsfcRequest.getDataFieldValue());

        customsfcRepository.save(customsfc);

    }

}
