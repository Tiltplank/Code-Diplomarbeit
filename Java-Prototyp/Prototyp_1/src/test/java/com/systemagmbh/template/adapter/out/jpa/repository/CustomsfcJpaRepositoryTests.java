package com.systemagmbh.template.adapter.out.jpa.repository;

import com.systemagmbh.template.adapter.out.jpa.dbo.CustomsfcDbo;
import com.systemagmbh.template.application.response.dto.CustomsfcDto;
import com.systemagmbh.template.application.response.dto.CustomsfcDtoInterfaceBased;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class CustomsfcJpaRepositoryTests {

    @Autowired
    private CustomsfcJpaRepository customsfcJpaRepository;

    @Test
    public void CustomsfcJpaRepository_findBySfcAndPlant_ReturnList(){

        //Create
        CustomsfcDbo customsfcDbo = CustomsfcDbo.builder()
                                    .sfc("BW01")
                                    .plant("BW")
                                    .dataField("Koordinaten_xyz")
                                    .dataFieldValue("12_2_5").build();

        customsfcJpaRepository.save(customsfcDbo);

        //Function
        List<CustomsfcDtoInterfaceBased> DtoList = customsfcJpaRepository.findBySfcAndPlant("BW01", "BW");

        //Test
        Assertions.assertThat(DtoList).isNotNull();


    }
}
