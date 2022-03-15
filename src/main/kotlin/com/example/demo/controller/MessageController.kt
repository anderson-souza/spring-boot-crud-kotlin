package com.example.demo.controller

import com.example.demo.model.Message
import com.example.demo.services.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/messages")
class MessageController(val service: MessageService) {

    @GetMapping
    fun index(): List<Message> = service.findAllMessages()

    @PostMapping
    fun saveMessage(@RequestBody message: Message): Message = service.saveMessage(message)
}