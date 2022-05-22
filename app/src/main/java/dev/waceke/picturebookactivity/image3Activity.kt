package dev.waceke.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class image3Activity : AppCompatActivity() {
    lateinit var btnPRev:Button
    lateinit var btnNExt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)
        btnPRev=findViewById(R.id.btnPRev)
        btnPRev.setOnClickListener {
            val intent=Intent(this,image2Activity::class.java)
            startActivity(intent)
        }
        btnNExt=findViewById(R.id.btnNExt)
        btnNExt.setOnClickListener {
            val intent=Intent(this,image4Activity::class.java)
            startActivity(intent)
        }

    }
}