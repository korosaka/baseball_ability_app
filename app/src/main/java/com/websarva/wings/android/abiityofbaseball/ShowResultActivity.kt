package com.websarva.wings.android.abiityofbaseball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ShowResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_result)

        displayPlayerInfo()
    }

    private fun displayPlayerInfo() {
        val playerInfoFrag = when (PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> PlayerInfoFragment.newInstance(makeFielder())
            else -> PlayerInfoFragment.newInstance(makePitcher())
        }

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_player_info, playerInfoFrag)
        transaction.commit()
    }

    private fun makeFielder(): PlayerClass {
        return PlayerClass(
                intent.getStringExtra(Constants.PLAYER_NAME)!!,
                intent.getStringExtra(Constants.POSITION)!!,
                intent.getIntExtra(Constants.BALLISTIC, 1),
                intent.getIntExtra(Constants.CONTACT, 0),
                intent.getIntExtra(Constants.POWER, 0),
                intent.getIntExtra(Constants.SPEED, 0),
                intent.getIntExtra(Constants.ARM_STRENGTH, 0),
                intent.getIntExtra(Constants.FIELDING, 0),
                intent.getIntExtra(Constants.CATCHING, 0),
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )
    }

    private fun makePitcher(): PlayerPitcherClass {
        return PlayerPitcherClass(
                intent.getStringExtra(Constants.PLAYER_NAME)!!,
                intent.getStringExtra(Constants.PITCHER_TYPE)!!,
                intent.getIntExtra(Constants.BALL_SPEED, 0),
                intent.getIntExtra(Constants.CONTROL, 0),
                intent.getIntExtra(Constants.STAMINA, 0),
                intent.getIntExtra(Constants.KIND_CHANGE, 0),
                intent.getIntExtra(Constants.AMOUNT_CHANGE, 0),
                intent.getIntegerArrayListExtra(Constants.PRIORITY_CHANGE)!!,
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )
    }
}