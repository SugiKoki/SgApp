package com.example.sgapp.Retrofit2

import com.google.gson.annotations.SerializedName

class LoginUserResponse (
    @SerializedName("success")
    var success: Boolean?,
    @SerializedName("code")
    var code: Int?,
    @SerializedName("data")
    var data: LoginUserData?
)

class LoginUser(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("password")
    var password: String? = null
)

class LoginUserData(
    @SerializedName("name")
    var name: String?,
    @SerializedName("email")
    var email: String?,
    @SerializedName("token")
    var token: String?
)