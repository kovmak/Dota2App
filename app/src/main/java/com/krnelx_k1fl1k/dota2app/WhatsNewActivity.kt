package com.krnelx_k1fl1k.dota2app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class WhatsNewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
    }

    fun ShopClick(view: android.view.View){
        val intent = Intent(this, ShopActivity::class.java)
        startActivity(intent)
    }

    fun MainMenu(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
