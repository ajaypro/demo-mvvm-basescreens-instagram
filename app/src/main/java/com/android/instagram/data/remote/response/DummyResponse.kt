package com.android.instagram.data.remote.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.android.instagram.data.model.Dummy

data class DummyResponse(
    @Expose
    @SerializedName("statusCode")
    var statusCode: String,

    @Expose
    @SerializedName("message")
    var message: String,

    @Expose
    @SerializedName("data")
    val data: List<Dummy>
)