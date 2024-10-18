package com.deeromptech.cryptotracker.crypto.domain

import com.deeromptech.cryptotracker.core.domain.util.NetworkError
import com.deeromptech.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}