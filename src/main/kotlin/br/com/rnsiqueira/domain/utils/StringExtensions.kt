package br.com.rnsiqueira.domain.utils

import com.google.gson.Gson
import kotlin.reflect.KClass

fun <T : Any> String.parseJson(clasz: KClass<T>): T =
    Gson()
        .newBuilder()
        .create()
        .fromJson(this, clasz.java)
