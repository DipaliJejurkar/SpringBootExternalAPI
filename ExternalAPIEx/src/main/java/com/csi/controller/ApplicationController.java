package com.csi.controller;

import com.csi.service.FeinClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    FeinClientService feinClientService;

    @GetMapping("/env")
    public ResponseEntity<String> getEnv(){
        return ResponseEntity.ok(feinClientService.getEnv());
    }
}
