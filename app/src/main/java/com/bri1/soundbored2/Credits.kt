package com.bri1.soundbored2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class Credits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credits)

        setupHyperlink()
    }

    private fun setupHyperlink() {
        // license
        val licenseLink = findViewById<TextView>(R.id.text_license_link)
        licenseLink.setMovementMethod(LinkMovementMethod.getInstance())

        // andrej github
        val andrejLink = findViewById<TextView>(R.id.text_andrej)
        andrejLink.setMovementMethod(LinkMovementMethod.getInstance())

        // webcooltz github
        val webcooltzLink = findViewById<TextView>(R.id.text_webcooltz)
        webcooltzLink.setMovementMethod(LinkMovementMethod.getInstance())

        // open source
        val openSourceLink = findViewById<TextView>(R.id.text_open_source)
        openSourceLink.setMovementMethod(LinkMovementMethod.getInstance())

        // flaticon
        val flatIconLink = findViewById<TextView>(R.id.text_icons)
        flatIconLink.setMovementMethod(LinkMovementMethod.getInstance())

        // privacy policy
        val privacyLink = findViewById<TextView>(R.id.privacy_policy)
        privacyLink.setMovementMethod(LinkMovementMethod.getInstance())
    }
}