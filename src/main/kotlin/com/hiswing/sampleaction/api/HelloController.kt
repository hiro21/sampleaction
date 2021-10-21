package com.hiswing.sampleaction.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping(path = ["/"])
    fun hello(): String = "hello"
}