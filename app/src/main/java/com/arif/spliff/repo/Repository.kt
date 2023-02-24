package com.arif.spliff.repo

import com.arif.spliff.model.login.RequestLogin
import com.arif.spliff.model.register.RequestRegisterUser
import com.arif.spliff.network.Api
import javax.inject.Inject

class Repository @Inject constructor(private var api: Api) {


    fun registerUserRepo(user: RequestRegisterUser) = api.registerUser(user)
    fun loginUserRepo(user: RequestLogin) = api.loginUser(user)
    fun logoutUserRepo() = api.logOutUser()


}