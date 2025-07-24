package com.tutorial.myshoppinglistapp

import eu.tutorials.myshoppinglistapp.GeocodingResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GeoCodingApiService {

    @GET("maps/api/geocode/json")

    suspend fun getAddressFromCoordinates(

        @Query("latlng") latlng: String,

        @Query("key") apikey: String

    ): GeocodingResponse


}