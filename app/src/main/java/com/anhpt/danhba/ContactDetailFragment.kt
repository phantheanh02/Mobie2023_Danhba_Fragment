package com.anhpt.danhba

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class ContactDetailFragment() : Fragment() {
    lateinit var name: String
    lateinit var id: String
    lateinit var phone: String
    lateinit var mail: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = this.arguments
        val tvId = view.findViewById(R.id.tvID) as TextView
        val tvPhone = view.findViewById(R.id.tvPhone) as TextView
        val tvEmail = view.findViewById(R.id.tvEmail) as TextView

        name = bundle?.getString("name").let { it } ?: ""
        id = bundle?.getString("id").let { it } ?: ""
        phone = bundle?.getString("phone").let { it } ?: ""
        mail = bundle?.getString("email").let { it } ?: ""

        tvId.text = id
        tvPhone.text = phone
        tvEmail.text = mail
    }
}