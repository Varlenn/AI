package com.example.project.database.managers

import com.example.project.CreateUserModel
import com.example.project.RespondUserModel
import com.example.project.UpdateUserModel
import com.example.project.UserIdModel
import com.example.project.database.mappers.UserMapper
import com.example.project.database.tabels.User
import com.google.inject.Inject
import com.google.inject.Singleton
import org.jetbrains.exposed.sql.transactions.transaction


class UserManagerImpl(
    private val userMapper: UserMapper
): UserManager {


    override fun createUser(user: CreateUserModel): RespondUserModel = transaction {
        User.new {
            login = user.login
            password = user.password
            email = user.email
        }
    }.let(userMapper::invoke)


    override fun getUser(id: UserIdModel): RespondUserModel {
        TODO("Not yet implemented")
    }

    override fun getAllUsers(): List<RespondUserModel> {
        TODO("Not yet implemented")
    }

    override fun updateUserModel(user: UpdateUserModel): RespondUserModel {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: UserIdModel) {
        TODO("Not yet implemented")
    }
}