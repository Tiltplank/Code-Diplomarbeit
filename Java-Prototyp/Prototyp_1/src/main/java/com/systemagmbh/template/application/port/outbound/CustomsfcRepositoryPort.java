package com.systemagmbh.template.application.port.outbound;

import com.systemagmbh.template.adapter.out.jpa.dbo.CustomsfcDbo;
import com.systemagmbh.template.application.response.dto.CustomsfcDto;
import com.systemagmbh.template.application.response.dto.CustomsfcDtoInterfaceBased;
import com.systemagmbh.template.domain.Customsfc;

import java.util.List;

public interface CustomsfcRepositoryPort {

    void save(Customsfc customsfc);

    void changeCustomsfc(Customsfc customsfc);

    List<CustomsfcDtoInterfaceBased> findCustomsfcBySfcAndPlant(CustomsfcDto customsfcDto);

    List<CustomsfcDtoInterfaceBased> findAllCustomsfc();

    CustomsfcDbo findSfcByKeyData(CustomsfcDto customsfcDto);

}
