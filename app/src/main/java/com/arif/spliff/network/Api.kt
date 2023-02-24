package com.arif.spliff.network

import com.arif.spliff.model.RegisterUser
import com.arif.spliff.model.ResponseRegisterUser
import com.arif.spliff.utils.P_Auth
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface Api {

    @POST("register")
    fun registerUser(
        @Body user: RegisterUser,
        @Header("P-Auth-Token") authorization: String = P_Auth
    ): Call<ResponseRegisterUser>


}