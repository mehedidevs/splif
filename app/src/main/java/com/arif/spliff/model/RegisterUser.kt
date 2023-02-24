package com.arif.spliff.model

data class RegisterUser(
    var name: String,
    var company: String?,
    var phone: String,
    var email: String,
    var password: String,
    var password_confirmation: String,
    var address: String,


    )
