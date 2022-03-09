package com.example.project.database.managers

import com.example.project.CreateUserModel
import com.example.project.RespondUserModel
import com.example.project.UpdateUserModel
import com.example.project.UserIdModel


interface UserManager {
    fun createUser(user: CreateUserModel): RespondUserModel
    fun getUser(id: UserIdModel): RespondUserModel
    fun getAllUsers(): List<RespondUserModel>
    fun updateUserModel(user: UpdateUserModel): RespondUserModel
    fun deleteUser(id: UserIdModel)
}