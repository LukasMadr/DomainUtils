package com.l00k.domainutils.utils

fun interface UseCase<in I, out O> {
    suspend operator fun invoke(input: I): O
}

fun interface UseCaseSync<in I, out O> {
    operator fun invoke(input: I): O
}