package com.springaop.controller;

import com.springaop.domain.Foo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FooController {

    @RequestMapping(method = RequestMethod.GET, value = "/aop", produces = MediaType.APPLICATION_JSON_VALUE)
    public Foo aopExample() {
        Foo foo = new Foo();
        foo.setMessage("hello");
        return foo;

    }
}
