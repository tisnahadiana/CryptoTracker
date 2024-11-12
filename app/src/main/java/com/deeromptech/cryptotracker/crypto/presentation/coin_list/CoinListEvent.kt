package com.deeromptech.cryptotracker.crypto.presentation.coin_list

import com.deeromptech.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}