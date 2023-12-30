package com.csi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "app",url = "https://jsonmock.hackerrank.com/api/countries?name=India")
public interface FeinClientService {




    @GetMapping
    public String getEnv();
}
