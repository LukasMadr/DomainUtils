package com.l00k.domainutils.utils

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Failure<out T>(val error: DataError) : Result<T>()
}

open class DataError(val message: String)