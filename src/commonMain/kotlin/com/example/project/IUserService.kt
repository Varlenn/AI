package com.example.project

import io.kvision.annotations.KVService
import kotlinx.serialization.Serializable

@Serializable
data class CreateUserModel(
    val login: String,
    val password: String,
    val email: String
)

@Serializable
data class UserIdModel(
    val id: String
)

@Serializable
data class RespondUserModel(
    val id: String,
    val login: String,
    val password: String,
    val email: String
)

typealias UpdateUserModel = RespondUserModel

@KVService
interface IUserService {
    suspend fun createUser(userModel: CreateUserModel): RespondUserModel
}