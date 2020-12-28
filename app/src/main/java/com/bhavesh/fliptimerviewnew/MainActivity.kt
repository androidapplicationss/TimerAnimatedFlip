package com.bhavesh.fliptimerviewnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.asp.fliptimerviewlibrary.CountDownClock

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val timerProgramCount= findViewById<CountDownClock>(R.id.timerCount)
            timerProgramCount.startCountDown(1500000)
        timerProgramCount.setCountdownListener(object : CountDownClock.CountdownCallBack {
            override fun countdownAboutToFinish() {
                //TODO Add your code here
            }

            override fun countdownFinished() {
                Toast.makeText(this@MainActivity, "Finished", Toast.LENGTH_SHORT).show()
                timerProgramCount.resetCountdownTimer()
            }
        })

    }
}