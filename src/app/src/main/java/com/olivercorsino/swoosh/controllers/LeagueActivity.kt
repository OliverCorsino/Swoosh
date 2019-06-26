package com.olivercorsino.swoosh.controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.olivercorsino.swoosh.R
import com.olivercorsino.swoosh.models.Player
import com.olivercorsino.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMenLeagueClicked(view: View) {
        womenLeagueButton.isChecked = false
        coEdLeagueButton.isChecked = false

        player.league = "Men"
    }

    fun onWomenLeagueClicked(view: View) {
        menLeagueButton.isChecked = false
        coEdLeagueButton.isChecked = false

        player.league  = "Women"
    }

    fun onCoEdLeagueClicked(view: View) {
        womenLeagueButton.isChecked = false
        menLeagueButton.isChecked = false

        player.league  = "Co-Ed"
    }


    fun leagueNextClicked(view: View) {
        if (player.league  != "") {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_PLAYER, player)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }

    }
}
