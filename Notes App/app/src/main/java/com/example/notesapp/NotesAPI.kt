package com.example.notesapp

import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface NotesAPI {


    @POST("/create")
    suspend fun postToDo(@Body requestBody: RequestBody): Response<ResponseBody>

    @GET("/todos")
    suspend fun getToDO(): Response<ResponseBody>

    @PUT("/update/:todoID")
    suspend fun updateToDO(@Body requestBody: RequestBody): Response<ResponseBody>

    @DELETE("/delete/:todoID")
    suspend fun deleteToDO(@Body requestBody: Request): Response<ResponseBody>


}