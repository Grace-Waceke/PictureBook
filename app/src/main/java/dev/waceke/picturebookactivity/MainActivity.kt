package dev.waceke.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btngallery: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btngallery=findViewById(R.id.btngallery)
        btngallery.setOnClickListener {
            val intent= Intent(this,image1Activity::class.java)
            startActivity(intent)
        }
    }
}