package com.systemagmbh.template.adapter.in.web;

import com.systemagmbh.template.application.port.inbound.ChangeCustomsfcPort;
import com.systemagmbh.template.application.port.inbound.CreateCustomsfcPort;
import com.systemagmbh.template.application.port.inbound.ReadAllCustomsfcPort;
import com.systemagmbh.template.application.port.inbound.ReadCustomsfcPort;
import com.systemagmbh.template.application.request.ChangeCustomsfcRequest;
import com.systemagmbh.template.application.request.CreateCustomsfcRequest;
import com.systemagmbh.template.application.request.ReadCustomsfcRequest;
import com.systemagmbh.template.application.response.CustomsfcDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping(value = "/api/customsfc")
@RestController
public class CustomsfcController {

    private final CreateCustomsfcPort createCustomsfcPort;
    private final ReadCustomsfcPort readCustomsfcPort;
    private final ReadAllCustomsfcPort readAllCustomsfcPort;
    private final ChangeCustomsfcPort changeCustomsfcPort;

    @PostMapping("create")
    public ResponseEntity<Void> createCustomsfc(@RequestBody final CreateCustomsfcRequest createCustomsfcRequest){
        createCustomsfcPort.createCustomsfc(createCustomsfcRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("change")
    public ResponseEntity<Void> changeCustomsfc(@RequestBody final ChangeCustomsfcRequest changeCustomsfcRequest){
        changeCustomsfcPort.changeCustomsfc(changeCustomsfcRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("read")
    public ResponseEntity<CustomsfcDataResponse> readCustomsfc(@RequestParam String sfc, @RequestParam String plant){
        ReadCustomsfcRequest readCustomsfcRequest = new ReadCustomsfcRequest();
        readCustomsfcRequest.setSfc(sfc);
        readCustomsfcRequest.setPlant(plant);

        return ResponseEntity.ok(readCustomsfcPort.readCustomsfc(readCustomsfcRequest));
    }

    @GetMapping("readall")
    public ResponseEntity<CustomsfcDataResponse> readAllCustomsfc(){

        return ResponseEntity.ok(readAllCustomsfcPort.readAllCustomsfc());
    }
}
