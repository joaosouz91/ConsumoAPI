package br.com.joaovictor.consumoapi.model

import com.google.gson.annotations.SerializedName

//data = classe de dados - encapsula um monte de informacoes - > equals, getters, setters
data class Pokemon(

    val name: String,//da match

    val sprites: Sprites


)