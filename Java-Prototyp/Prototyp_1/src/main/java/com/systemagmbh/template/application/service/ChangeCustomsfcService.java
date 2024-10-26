package com.systemagmbh.template.application.service;

import com.systemagmbh.template.adapter.out.jpa.dbo.CustomsfcDbo;
import com.systemagmbh.template.application.port.inbound.ChangeCustomsfcPort;
import com.systemagmbh.template.application.port.outbound.CustomsfcRepositoryPort;
import com.systemagmbh.template.application.request.ChangeCustomsfcRequest;
import com.systemagmbh.template.application.response.dto.CustomsfcDto;
import com.systemagmbh.template.domain.Customsfc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChangeCustomsfcService implements ChangeCustomsfcPort {

    private final CustomsfcRepositoryPort customsfcRepository;

    @Override
    public void changeCustomsfc(ChangeCustomsfcRequest changeCustomsfcRequest){

        CustomsfcDto customsfcDto = new CustomsfcDto();
        customsfcDto.setSfc(changeCustomsfcRequest.getSfc());
        customsfcDto.setPlant(changeCustomsfcRequest.getPlant());
        customsfcDto.setDataField(changeCustomsfcRequest.getDataField());
        customsfcDto.setDataFieldValue(changeCustomsfcRequest.getDataFieldValue());
        CustomsfcDbo customsfcDbo = customsfcRepository.findSfcByKeyData(customsfcDto);

        Customsfc customsfc = customsfcDbo.toCustomsfc();
        customsfc.setDataField(changeCustomsfcRequest.getDataFieldNew());
        customsfc.setDataFieldValue(changeCustomsfcRequest.getDataFieldValueNew());
        customsfcRepository.changeCustomsfc(customsfc);


    }

}
