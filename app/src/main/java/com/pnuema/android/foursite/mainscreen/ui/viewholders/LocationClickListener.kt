package com.pnuema.android.foursite.mainscreen.ui.viewholders

import androidx.appcompat.widget.SearchView

interface LocationClickListener {
    fun onLocationClicked(id: String)
    fun onFavoriteClicked(id: String)
}