package com.systemagmbh.template.application.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.systemagmbh.template.application.response.dto.CustomsfcDtoInterfaceBased;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomsfcDataResponse {

    @JsonProperty("customsfcData")
    private List<CustomsfcDtoInterfaceBased> customsfcDataDto;
}
