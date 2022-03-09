/*
package com.example.project.database.models

import com.example.project.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class CreateUserModel(
    val login: String,
    val password: String,
    val email: String
)

@Serializable
data class UserIdModel(
    @Serializable(with = UUIDSerializer::class)
    val id: UUID
)

@Serializable
data class RespondUserModel(
    @Serializable(with = UUIDSerializer::class)
    val id: UUID,
    val login: String,
    val password: String,
    val email: String
)

typealias UpdateUserModel = RespondUserModel*/
