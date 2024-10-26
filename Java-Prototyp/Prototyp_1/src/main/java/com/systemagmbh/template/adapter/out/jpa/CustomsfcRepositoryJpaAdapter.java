package com.systemagmbh.template.adapter.out.jpa;

import com.systemagmbh.template.adapter.out.jpa.dbo.CustomsfcDbo;
import com.systemagmbh.template.adapter.out.jpa.repository.CustomsfcJpaRepository;
import com.systemagmbh.template.application.port.outbound.CustomsfcRepositoryPort;
import com.systemagmbh.template.application.response.dto.CustomsfcDto;
import com.systemagmbh.template.application.response.dto.CustomsfcDtoInterfaceBased;
import com.systemagmbh.template.domain.Customsfc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomsfcRepositoryJpaAdapter implements CustomsfcRepositoryPort {

    private final CustomsfcJpaRepository customsfcJpaRepository;

    public CustomsfcRepositoryJpaAdapter(CustomsfcJpaRepository customsfcJpaRepository){
        this.customsfcJpaRepository = customsfcJpaRepository;
    }

    @Override
    public void save(Customsfc customsfc){
        CustomsfcDbo customsfcDbo = new CustomsfcDbo(customsfc);
        customsfcJpaRepository.save(customsfcDbo);
    }

    @Override
    public void changeCustomsfc(Customsfc customsfc){
        CustomsfcDbo customsfcDbo = new CustomsfcDbo(customsfc);
        customsfcJpaRepository.changeCustomsfc(customsfcDbo.getId(), customsfcDbo.getDataField(), customsfcDbo.getDataFieldValue());
    }

    @Override
    public List<CustomsfcDtoInterfaceBased> findCustomsfcBySfcAndPlant(CustomsfcDto customsfcDto){

        return customsfcJpaRepository.findBySfcAndPlant(customsfcDto.getSfc(), customsfcDto.getPlant());
    }

    @Override
    public List<CustomsfcDtoInterfaceBased> findAllCustomsfc(){

        return customsfcJpaRepository.findAllSfc();
    }

    @Override
    public CustomsfcDbo findSfcByKeyData(CustomsfcDto customsfcDto){

        return customsfcJpaRepository.findByKeyData(customsfcDto.getSfc(), customsfcDto.getPlant(), customsfcDto.getDataField(), customsfcDto.getDataFieldValue());
    }

}
