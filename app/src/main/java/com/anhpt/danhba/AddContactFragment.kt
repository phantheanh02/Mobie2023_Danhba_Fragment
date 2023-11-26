package com.anhpt.danhba

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class AddContactFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btnAddContact)
        val tvName = view.findViewById<TextView>(R.id.editTextTextPersonName)
        val tvPhone = view.findViewById<TextView>(R.id.editTextTextPersonName2)
        val tvMail = view.findViewById<TextView>(R.id.editTextTextPersonName3)
        button.setOnClickListener {
            val newContact = ContactModel(id = 99, name = tvName.text.toString(), email = tvMail.text.toString(), phoneNumber = tvPhone.text.toString())
            ListContactFragment.contacts.add(newContact)
            activity?.finish()
        }
    }
}