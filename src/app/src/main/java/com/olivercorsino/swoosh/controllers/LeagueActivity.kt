package com.olivercorsino.swoosh.controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.olivercorsino.swoosh.R
import com.olivercorsino.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenLeagueClicked(view: View) {
        womenLeagueButton.isChecked = false
        coEdLeagueButton.isChecked = false

        selectedLeague = "Men's"
    }

    fun onWomenLeagueClicked(view: View) {
        menLeagueButton.isChecked = false
        coEdLeagueButton.isChecked = false

        selectedLeague = "Women's"
    }

    fun onCoEdLeagueClicked(view: View) {
        womenLeagueButton.isChecked = false
        menLeagueButton.isChecked = false

        selectedLeague = "Co-Ed's"
    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }

    }
}
