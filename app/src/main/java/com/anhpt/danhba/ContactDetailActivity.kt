package com.anhpt.danhba

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
        val fragment = ContactDetailFragment()
        fragment.arguments = intent.extras
        supportFragmentManager.beginTransaction()
            .add(R.id.contact_detail_fragment, fragment)
            .commit()
    }
}