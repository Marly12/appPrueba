package com.hawei.appprueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        startTimer()

    }

    fun startTimer(){
        object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
               val intent = Intent(applicationContext, MainActivity::class.java).apply {}
                startActivity(intent)

            }

        }.start()
    }
}