package dev.waceke.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image5Activity : AppCompatActivity() {
    lateinit var btnprevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image5)
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            val intent= Intent(this,image4Activity::class.java)
            startActivity(intent)
        }
    }
}