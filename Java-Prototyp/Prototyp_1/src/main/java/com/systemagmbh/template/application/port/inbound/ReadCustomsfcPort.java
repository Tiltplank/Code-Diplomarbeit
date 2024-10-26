package com.systemagmbh.template.application.port.inbound;

import com.systemagmbh.template.application.request.ReadCustomsfcRequest;
import com.systemagmbh.template.application.response.CustomsfcDataResponse;

public interface ReadCustomsfcPort {

    CustomsfcDataResponse readCustomsfc(ReadCustomsfcRequest readCustomsfcRequest);
    
}
