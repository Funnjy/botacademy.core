package com.botacademy.botacademy.core.controllers

import com.botacademy.botacademy.core.model.HelloResponse
import com.botacademy.botacademy.core.service.DummyService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BotAcademyController(val dummyService: DummyService) {

    @GetMapping(path = ["hello"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun hello(): ResponseEntity<HelloResponse> {
        return dummyService.getHello()
    }

}