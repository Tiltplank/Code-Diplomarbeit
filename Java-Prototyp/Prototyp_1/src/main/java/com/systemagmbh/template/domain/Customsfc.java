package com.systemagmbh.template.domain;

import java.util.Objects;

public class Customsfc {

    private Integer id;
    private String sfc;
    private String plant;
    private String dataField;
    private String dataFieldValue;

    public Customsfc(){

    }

    public Customsfc(String sfc, String plant, String dataField, String dataFieldValue){
        this.sfc = sfc;
        this.plant = plant;
        this.dataField = dataField;
        this.dataFieldValue = dataFieldValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSfc(){
        return sfc;
    }

    public void setSfc(String sfc){
        this.sfc = sfc;
    }

    public String getPlant(){
        return plant;
    }

    public void setPlant(String plant){
        this.plant = plant;
    }

    public String getDataField(){
        return dataField;
    }

    public void setDataField(String dataField){
        this.dataField = dataField;
    }

    public String getDataFieldValue(){
        return dataFieldValue;
    }

    public void setDataFieldValue(String dataFieldValue){
        this.dataFieldValue = dataFieldValue;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;
        Customsfc customsfc = (Customsfc) object;
        return Objects.equals(sfc, customsfc.sfc) && Objects.equals(plant, customsfc.plant) && Objects.equals(dataField, customsfc.dataField) && Objects.equals(dataFieldValue, customsfc.dataFieldValue);
    }

    @Override
    public int hashCode(){
        return Objects.hash(sfc, plant, dataField, dataFieldValue);
    }

    @Override
    public String toString(){
        return "Customsfc{" +
                "sfc=" + sfc +
                ", plant='" + plant + '\'' +
                ", datafield='" + dataField + '\'' +
                ", datafieldvalue='" + dataFieldValue +
                '}';
    }

}
