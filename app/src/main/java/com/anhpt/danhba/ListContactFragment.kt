package com.anhpt.danhba

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListContactFragment: Fragment() {
    lateinit var listContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listContact = view.findViewById(R.id.mail_list_view)
        listContact.layoutManager = LinearLayoutManager(context)
        listContact.adapter = ContactAdapter(contacts)
        listContact.setHasFixedSize(true)

    }

    override fun onResume() {
        super.onResume()
        listContact.adapter?.run {
            notifyDataSetChanged()
        }
    }

    companion object {
        var contacts: ArrayList<ContactModel> = arrayListOf(
            ContactModel(id = 1, name = "Nguyễn Duy Doanh", email = "admin@bn2002.com", phoneNumber = "0123456789"),
            ContactModel(id = 2, name = "Phan Thế Anh", email = "theanh@bn2002.com", phoneNumber = "0124956789"),
            ContactModel(id = 3, name = "Lê Thế Anh", email = "letheanh@bn2002.com", phoneNumber = "0933456789"),
            ContactModel(id = 4, name = "Nguyễn Văn Chung", email = "vanchung@bn2002.com", phoneNumber = "0853456789"),
            ContactModel(id = 5, name = "Phan Trung Dũng", email = "trungdung@bn2002.com", phoneNumber = "0633765781"),
            ContactModel(id = 6, name = "Hoàng Minh Dũng", email = "minhdung@bn2002.com", phoneNumber = "0346456289"),
            ContactModel(id = 1, name = "Nguyễn Duy Doanh", email = "admin@bn2002.com", phoneNumber = "0123456789"),
            ContactModel(id = 2, name = "Phan Thế Anh", email = "theanh@bn2002.com", phoneNumber = "0124956789"),
            ContactModel(id = 3, name = "Lê Thế Anh", email = "letheanh@bn2002.com", phoneNumber = "0933456789"),
            ContactModel(id = 4, name = "Nguyễn Văn Chung", email = "vanchung@bn2002.com", phoneNumber = "0853456789"),
            ContactModel(id = 5, name = "Phan Trung Dũng", email = "trungdung@bn2002.com", phoneNumber = "0633765781"),
            ContactModel(id = 6, name = "Hoàng Minh Dũng", email = "minhdung@bn2002.com", phoneNumber = "0346456289"),
            ContactModel(id = 1, name = "Nguyễn Duy Doanh", email = "admin@bn2002.com", phoneNumber = "0123456789"),
            ContactModel(id = 2, name = "Phan Thế Anh", email = "theanh@bn2002.com", phoneNumber = "0124956789"),
            ContactModel(id = 3, name = "Lê Thế Anh", email = "letheanh@bn2002.com", phoneNumber = "0933456789"),
            ContactModel(id = 4, name = "Nguyễn Văn Chung", email = "vanchung@bn2002.com", phoneNumber = "0853456789"),
            ContactModel(id = 5, name = "Phan Trung Dũng", email = "trungdung@bn2002.com", phoneNumber = "0633765781"),
            ContactModel(id = 6, name = "Hoàng Minh Dũng", email = "minhdung@bn2002.com", phoneNumber = "0346456289"))
    }

}