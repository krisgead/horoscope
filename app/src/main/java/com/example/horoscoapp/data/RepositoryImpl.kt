package com.example.horoscoapp.data

import android.util.Log
import com.example.horoscoapp.data.network.HoroscopeApiService
import com.example.horoscoapp.domain.model.PredictionModel
import com.example.horoscoapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository {

override suspend fun getPrediction(sign:String): PredictionModel? {
   runCatching {  apiService.getHoroscope(sign)}
       .onSuccess { return it.toDomain() }
       .onFailure { Log.i("aris","ha ocurrido un error ${it.message}") }
            return null
    }
}