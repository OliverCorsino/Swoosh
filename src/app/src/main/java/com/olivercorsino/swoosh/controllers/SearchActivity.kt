package com.olivercorsino.swoosh.controllers

import android.os.Bundle
import com.olivercorsino.swoosh.R
import com.olivercorsino.swoosh.models.Player
import com.olivercorsino.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchText.text = "Looking for a ${player.league} ${player.skill} league near You..."
    }
}
