package com.olivercorsino.swoosh.controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.olivercorsino.swoosh.R
import com.olivercorsino.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        ballerButton.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerButton.isChecked = false
        skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (skill != "") {
            val intent = Intent(this, SearchActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE, league)
            intent.putExtra(EXTRA_SKILL, skill)

            startActivity(intent);
        } else {
            Toast.makeText(this, "Plase select an Skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
