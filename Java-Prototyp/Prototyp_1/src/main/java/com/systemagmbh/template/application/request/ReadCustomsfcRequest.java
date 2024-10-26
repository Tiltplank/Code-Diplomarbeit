package com.systemagmbh.template.application.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ReadCustomsfcRequest {

    private String sfc;

    private String plant;

    private String dataField;

    private String dataFieldValue;

}
