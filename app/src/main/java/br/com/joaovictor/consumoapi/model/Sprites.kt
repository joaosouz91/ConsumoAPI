package br.com.joaovictor.consumoapi.model

import com.google.gson.annotations.SerializedName

data class Sprites(

    //neste caso o nome esta diferente do que a API disponibiliza
    @SerializedName("back_default")
    val frontDefault: String
)