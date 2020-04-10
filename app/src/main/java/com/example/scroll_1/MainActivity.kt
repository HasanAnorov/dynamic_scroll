package com.example.scroll_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        val linerlay :LinearLayout=LinearLayout(this)

        setContentView(linerlay)

        linerlay.orientation=LinearLayout.VERTICAL

        val edittxt :EditText= EditText(this)

        val btn :Button= Button(this)

        linerlay.addView(edittxt)

        linerlay.addView(btn)

        btn.setOnClickListener {
            if (edittxt.text.toString().isNotEmpty()) {
                val move_second = Intent(this, SecondActivity::class.java)
                move_second.putExtra("count" ,edittxt.text.toString())
                startActivity(move_second)
            }
        }


    }
}
