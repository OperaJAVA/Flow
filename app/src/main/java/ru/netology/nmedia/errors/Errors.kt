package ru.netology.nmedia.errors

sealed class AppError(private val code: Int, private val info: String) : RuntimeException()

class ApiException(code: Int, info: String) : AppError(code, info)

object NetworkException : AppError(code = -1, info = "No_Network_Exception")
object UnknownException : AppError(code = -2, info = "Unknown_Exception")