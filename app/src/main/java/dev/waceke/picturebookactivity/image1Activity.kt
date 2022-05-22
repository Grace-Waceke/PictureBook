package dev.waceke.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image1Activity : AppCompatActivity() {
    lateinit var btnprev:Button
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image1)
        btnprev=findViewById(R.id.btnprev)
        btnprev.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent=Intent(this,image2Activity::class.java)
            startActivity(intent)
        }

    }
}