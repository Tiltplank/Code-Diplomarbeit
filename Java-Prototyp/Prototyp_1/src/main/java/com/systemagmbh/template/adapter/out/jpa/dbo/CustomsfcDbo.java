package com.systemagmbh.template.adapter.out.jpa.dbo;

import com.systemagmbh.template.domain.Customsfc;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name="custom_sfc")
@Entity
public class CustomsfcDbo {

    @Id
    @GeneratedValue
    private Integer id;

    private String sfc;
    private String plant;
    private String dataField;
    private String dataFieldValue;

    public CustomsfcDbo(Customsfc customsfc){
        this.id = customsfc.getId();
        this.sfc = customsfc.getSfc();
        this.plant = customsfc.getPlant();
        this.dataField = customsfc.getDataField();
        this.dataFieldValue = customsfc.getDataFieldValue();

    }

    public Customsfc toCustomsfc(){

        Customsfc customsfc = new Customsfc();
        customsfc.setId(this.id);
        customsfc.setSfc(this.sfc);
        customsfc.setPlant(this.plant);
        customsfc.setDataField(this.dataField);
        customsfc.setDataFieldValue(this.dataFieldValue);
        return customsfc;
    }
}
