package com.example.project

import com.example.project.database.initDatabase
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.kvision.remote.applyRoutes
import io.kvision.remote.kvisionInit
import org.koin.ktor.ext.Koin


fun Application.main() {

    initDatabase()

    install(Koin) {
        modules(
            userModule
        )
    }


    install(Compression)
    routing {
        applyRoutes(PingServiceManager)
        applyRoutes(UserServiceManager)
    }
    kvisionInit()
}
