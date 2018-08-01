package com.ui.adhocservices.controller;

import com.ui.adhocservices.services.UIAdhocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dash on 8/1/2018.
 */
@RestController
@CrossOrigin("*")
public class UIAdhocController {

    @Autowired
    private UIAdhocServiceImpl uiAdhocService;

    @GetMapping(value = "/uiadhoc/getReport")
    public ResponseEntity getFile(){
        return uiAdhocService.runProtactorTest();
    }
}
