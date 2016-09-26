package com.github.gregwhitaker.catnapspringboot.sample.controller;

import com.github.gregwhitaker.catnap.springboot.annotation.CatnapResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    @CatnapResponseBody
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("This is a test");
    }
}
