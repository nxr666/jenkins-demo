package com.nxr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCrontroller {

    @RequestMapping
    String getName() {
        return "hahah";
    }
}
