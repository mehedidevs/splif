package com.arif.spliff.repo

import com.arif.spliff.model.RegisterUser
import com.arif.spliff.network.Api
import javax.inject.Inject

class Repository @Inject constructor(private var api: Api) {


    fun registerUserRepo(user: RegisterUser) = api.registerUser(user)


}