package dev.waceke.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image2Activity : AppCompatActivity() {
    lateinit var btnPrev:Button
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)
        btnPrev=findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent=Intent(this,image1Activity::class.java)
            startActivity(intent)
        }
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
          val intent=Intent(this,image3Activity::class.java)
            startActivity(intent)
        }
    }
}