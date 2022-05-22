package dev.waceke.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image4Activity : AppCompatActivity() {
    lateinit var btnpp:Button
    lateinit var btnnextone:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image4)
        btnpp=findViewById(R.id.btnpp)
        btnpp.setOnClickListener {
            val intent= Intent(this,image3Activity::class.java)
            startActivity(intent)
        }
       btnnextone=findViewById(R.id.btnnextone)
        btnnextone.setOnClickListener {
            val intent= Intent(this,image5Activity::class.java)
            startActivity(intent)
        }
    }
}