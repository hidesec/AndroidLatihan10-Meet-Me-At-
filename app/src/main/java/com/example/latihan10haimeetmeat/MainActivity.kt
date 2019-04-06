package com.example.latihan10haimeetmeat

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.meet_me_at.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meet_me_at)

        twitter.setOnClickListener {
            val click = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/raihan_hafis212?lang=id"))
            startActivity(click)
        }
        facebook.setOnClickListener{
            val click = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hafis.coslimcluu"))
            startActivity(click)
        }
        instagram.setOnClickListener {
            val click = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/raihan_hafis/"))
            startActivity(click)
        }
        github.setOnClickListener {
            val click = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/hidesec"))
            startActivity(click)
        }
    }
}
