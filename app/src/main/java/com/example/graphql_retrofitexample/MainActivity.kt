package com.example.graphql_retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WsApi.create().getAuthUser(bodyAuth("user","password")).enqueue(object : Callback<Authentication> {
            override fun onFailure(call: Call<Authentication>?, t: Throwable?) {
                Log.d(this@MainActivity.localClassName, t?.message ?: " WTF ")
            }

            override fun onResponse(call: Call<Authentication>?, response: Response<Authentication>?) {
                Log.d(this@MainActivity.localClassName, response?.body()?.toString() ?: " WTF ")
            }
        })
    }
}
