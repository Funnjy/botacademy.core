package com.botacademy.botacademy.core.service

import com.botacademy.botacademy.core.model.HelloResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class DummyService {
    fun getHello(): ResponseEntity<HelloResponse>{
        return ResponseEntity(
            HelloResponse("Hello, it's me!"),
            HttpStatus.OK
        )
    }
}