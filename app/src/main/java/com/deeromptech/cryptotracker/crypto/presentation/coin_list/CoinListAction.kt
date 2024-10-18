package com.deeromptech.cryptotracker.crypto.presentation.coin_list

import com.deeromptech.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
    data object OnRefresh: CoinListAction
}