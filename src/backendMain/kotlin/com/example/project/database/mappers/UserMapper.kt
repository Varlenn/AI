package com.example.project.database.mappers

import com.example.project.RespondUserModel
import com.example.project.database.tabels.User


interface UserMapper : Mapper<User, RespondUserModel>


class UserMapperImpl: UserMapper {
    override fun invoke(input: User): RespondUserModel {
        return RespondUserModel(
            id = input.id.value.toString(),
            login = input.login,
            password = input.password,
            email = input.email
        )
    }
}