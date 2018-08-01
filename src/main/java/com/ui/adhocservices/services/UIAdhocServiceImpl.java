package com.ui.adhocservices.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by Dash on 8/1/2018.
 */
@Service
public class UIAdhocServiceImpl {

    public ResponseEntity runProtactorTest(){
        try {
            Process process = new ProcessBuilder( "D:\\dev\\script2\\e2eStart.bat").start();
            process.waitFor();
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
