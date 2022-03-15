package com.example.demo.services

import com.example.demo.model.Message
import com.example.demo.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findAllMessages(): List<Message> = db.findMessages()

    fun saveMessage(message: Message) = db.save(message)

}