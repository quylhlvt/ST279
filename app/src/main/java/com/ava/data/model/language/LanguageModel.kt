package com.ava.data.model.language

data class LanguageModel(    val code: String,
                             val name: String,
                             val flag: Int,
                             var activate: Boolean = false)
