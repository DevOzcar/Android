package com.example.graphql_retrofitexample

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import org.json.JSONObject
import okhttp3.RequestBody.Companion.toRequestBody

fun bodyAuth(user: String, password: String): RequestBody {
    val jsonBase = JSONObject()
    val value = "mutation {tokenAuth(username:\"$user\",password:\"$password\"){token,user{id,username,firstName,lastName,email}}}"
    jsonBase.put("query", value)

    return jsonBase.toString().toRequestBody("application/json; charset=utf-8".toMediaTypeOrNull())
}
