package com.example.project

import com.example.project.database.managers.UserManager
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

actual class UserService : IUserService, KoinComponent {

    private val userManager: UserManager by inject()

    override suspend fun createUser(userModel: CreateUserModel) = userManager.createUser(userModel)
}