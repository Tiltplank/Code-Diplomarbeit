package com.systemagmbh.template.application.response.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomsfcDto {

    private Integer id;
    private String sfc;
    private String plant;
    private String dataField;
    private String dataFieldValue;
}
