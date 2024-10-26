package com.systemagmbh.template.application.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class CreateCustomsfcRequest {

    private String sfc;
    private String plant;
    private String dataField;
    private String dataFieldValue;

}
