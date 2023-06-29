package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VaultController {

    @Value("${vault.secret1}")
    String secret1;

    @Value("${vault.secret2}")
    String secret2;

    @GetMapping("/secret")
    public Map<String,String> getSecret()
    {
        Map<String,String> map = new HashMap<>();
        map.put("key1",secret1);
        map.put("key2",secret2);

        return map;
    }
}