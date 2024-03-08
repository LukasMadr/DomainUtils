package com.l00k.domainutils.utils

inline fun <T> Result<T>.onSuccess(block: (T) -> Unit): Result<T> {
    if (this is Result.Success<T>) {
        block(this.data)
    }
    return this
}

inline fun <T> Result<T>.onFailure(block: (DataError) -> Unit): Result<T> {
    if (this is Result.Failure<T>) {
        block(this.error)
    }
    return this
}

fun <T> Result<T>?.getOrNull() = if (this is Result.Success) {
    this.data
} else {
    null
}
