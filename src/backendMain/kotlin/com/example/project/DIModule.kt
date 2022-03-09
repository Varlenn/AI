package com.example.project

import com.example.project.database.managers.UserManager
import com.example.project.database.managers.UserManagerImpl
import com.example.project.database.mappers.UserMapper
import com.example.project.database.mappers.UserMapperImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val userModule = module {
    singleOf(::UserMapperImpl) {
        bind<UserMapper>()
    }
    singleOf(::UserManagerImpl) {
        bind<UserManager>()
    }
}