package com.sap.api;

import com.sap.domain.sap_entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sap_controller {
  public static final String strDefine = "Hello, %s!";

    @GetMapping("/sap")
    public String getSapEntity(@RequestParam(value = "sap_entity_name", defaultValue = "Enthusiast") String sap_entity_name) {
        sap_entity entity = new sap_entity(sap_entity_name);
        return String.format(strDefine, entity.get_name());
    }
}
