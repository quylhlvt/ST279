package com.avatar.school.oc.stylish.data.datalocal.api

import com.avatar.school.oc.stylish.data.model.api.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface CatalogueApi {
    @GET("api/ST183_PrincessAvatarMaker")
    suspend fun getData(): Response<CharacterResponse>
}