package com.example.scroll_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val scroll = ScrollView(this)
        val layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT)
        scroll.layoutParams = layoutParams

        val linearLayout :LinearLayout= LinearLayout(this)
        linearLayout.orientation=LinearLayout.VERTICAL
        scroll.addView(linearLayout)
        setContentView(scroll)
        super.onCreate(savedInstanceState)
        val amount =intent.getStringExtra("count")!!
        for(i in 0 until amount.toInt()) {

            val btn :Button= Button(this)
            btn.text="Button $(i+1)"
            linearLayout.addView(btn)

        }
    }
}
