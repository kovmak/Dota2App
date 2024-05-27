package com.krnelx_k1fl1k.dota2app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)
    }

    fun WhatsNewClick(view: View) {
        val intent = Intent(this, WhatsNewActivity::class.java)
        startActivity(intent)
    }

    fun MainMenu(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
