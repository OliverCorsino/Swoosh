package com.olivercorsino.swoosh.controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.olivercorsino.swoosh.R
import com.olivercorsino.swoosh.models.Player
import com.olivercorsino.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
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

    fun onBeginnerClicked(view: View) {
        ballerButton.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerButton.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val intent = Intent(this, SearchActivity::class.java)
            intent.putExtra(EXTRA_PLAYER, player)

            startActivity(intent);
        } else {
            Toast.makeText(this, "Plase select an Skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
