package com.example.cryptohawk.Repository

import com.example.cryptohawk.Api.RetrofitInstance
import com.example.cryptohawk.Database.CryptoDatabase
import com.example.cryptohawk.Model.ChartResponse
import com.example.cryptohawk.Model.CryptoResponse
import com.example.cryptohawk.Model.MarketResponse
import retrofit2.Response

class cryptoRepository(val db: CryptoDatabase) {

    suspend fun getCryptoList(
        currency: String,
        order: String,
        numberPP: Int
    ): Response<CryptoResponse> {
        return RetrofitInstance.api
            .getCryptoList(currency, order, numberPP, page = 1, sparkline = false)
    }

    suspend fun getChart(id: String, currency: String, days: String): Response<ChartResponse> {
        return RetrofitInstance.api.getMarketChart(id, currency, days)
    }

    suspend fun getMarketData(): Response<MarketResponse> {
        return RetrofitInstance.api.getMarketData()
    }
}