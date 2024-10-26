package com.systemagmbh.template.adapter.out.jpa.repository;

import com.systemagmbh.template.adapter.out.jpa.dbo.CustomsfcDbo;
import com.systemagmbh.template.application.response.dto.CustomsfcDtoInterfaceBased;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CustomsfcJpaRepository extends JpaRepository<CustomsfcDbo, Integer> {

    @Query(value = """
            select
                o.id as id,
                o.sfc as sfc,
                o.plant as plant,
                o.data_field as dataField,
                o.data_field_value as dataFieldValue
            from
                custom_sfc o
            where
                o.sfc = :sfc
                and o.plant = :plant
                and o.data_field = :dataField
                and o.data_field_value = :dataFieldValue
            """, nativeQuery = true)
    CustomsfcDbo findByKeyData(String sfc, String plant, String dataField, String dataFieldValue);

    @Query(value = """
            select
                o.id as id,
                o.sfc as sfc,
                o.plant as plant,
                o.data_field as dataField,
                o.data_field_value as dataFieldValue
            from
                custom_sfc o
            where
                o.sfc = :sfc
                and o.plant = :plant
            """, nativeQuery = true)
    List<CustomsfcDtoInterfaceBased> findBySfcAndPlant(String sfc, String plant);

    @Query(value = """
            select
                o.id as id,
                o.sfc as sfc,
                o.plant as plant,
                o.data_field as dataField,
                o.data_field_value as dataFieldValue
            from
                custom_sfc o
            """, nativeQuery = true)
    List<CustomsfcDtoInterfaceBased> findAllSfc();

    @Modifying
    @Query(value = """
            update
                custom_sfc o
            set
                o.data_field = :dataField,
                o.data_field_value = :dataFieldValue
            where
                o.id = :id
            """, nativeQuery = true)
    void changeCustomsfc(Integer id, String dataField, String dataFieldValue);


}
