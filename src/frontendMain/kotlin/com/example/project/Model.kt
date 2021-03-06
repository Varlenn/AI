package com.example.project

object Model {

    private val pingService = PingService()

    suspend fun ping(message: String): String {
        return pingService.ping(message)
    }

}
