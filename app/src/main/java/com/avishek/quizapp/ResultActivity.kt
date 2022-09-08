package com.avishek.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tvUsername)
        val tvScore: TextView = findViewById(R.id.tvResultText)
        val total: Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correct: Int = intent.getIntExtra(Constants.CORRECT_QUESTION,0)
        val btnFinish: Button = findViewById(R.id.finishButton)

        tvName.text = "Congratulations " + intent.getStringExtra(Constants.USER_NAME) + "!"
        tvScore.text = "Your score is: ${correct.toString()}/${total.toString()}"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }
}