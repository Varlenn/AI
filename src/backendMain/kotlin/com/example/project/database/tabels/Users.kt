package com.example.project.database.tabels

import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.UUIDTable
import java.util.*

object Users : UUIDTable() {
    val login = varchar("user_login", 32)
    val password = varchar("user_password", 32)
    val email = varchar("user_email", 32)
}

class User(id: EntityID<UUID>) : UUIDEntity(id) {
    companion object: EntityClass<UUID, User>(Users)

    var login by Users.login
    var password by Users.password
    var email by Users.email
}