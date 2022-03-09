package com.example.project.database.mappers

interface Mapper<in INPUT, out OUTPUT> {
    operator fun invoke(input: INPUT): OUTPUT
}