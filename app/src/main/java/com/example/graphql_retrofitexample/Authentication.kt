package com.example.graphql_retrofitexample

import com.google.gson.annotations.SerializedName


class Authentication {
    @SerializedName("tokenAuth")
    var auth: TokenAuth? = null

    data class TokenAuth(val token: String, val user: User)
    data class User(val id: String?, val name: String?)
}