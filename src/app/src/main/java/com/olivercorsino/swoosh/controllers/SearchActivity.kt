package com.olivercorsino.swoosh.controllers

import android.os.Bundle
import com.olivercorsino.swoosh.R
import com.olivercorsino.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchText.text = "Looking for a $league $skill league near You..."
    }
}
