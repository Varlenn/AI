package com.example.project.database

import com.example.project.database.tabels.Users
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.postgresql.Driver
import kotlin.reflect.jvm.jvmName

fun initDatabase() {
    val url = System.getenv("DB_URL") ?: "jdbc:postgresql://localhost:5432/ai-database"
    val user = System.getenv("DB_USER") ?: "root"
    val password = System.getenv("DB_USER") ?: "example"
    Database.connect(
        url = url,
        user = user,
        password = password,
        driver = Driver::class.jvmName
    )
    transaction {
        SchemaUtils.createMissingTablesAndColumns(
            Users
        )
    }
}