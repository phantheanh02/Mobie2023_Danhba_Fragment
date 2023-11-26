package com.anhpt.danhba

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AddContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Add Contact"
        setContentView(R.layout.activity_add_contact)
        val fragment = AddContactFragment()
        fragment.arguments = intent.extras
        supportFragmentManager.beginTransaction()
            .add(R.id.add_contact_fragment, fragment)
            .commit()

    }
}