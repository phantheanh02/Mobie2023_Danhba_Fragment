package com.anhpt.danhba

import android.content.Context
import android.content.Intent
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val mails: ArrayList<ContactModel>): RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {

    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row),
        View.OnCreateContextMenuListener {
        val tvName = row.findViewById(R.id.text_from) as TextView

        init {
            row.setOnCreateContextMenuListener(this)
        }

        override fun onCreateContextMenu(
            menu: ContextMenu?,
            v: View?,
            menuInfo: ContextMenu.ContextMenuInfo?
        ) {
            menu?.add(0, 1, 1, "SMS")
            menu?.add(0, 2, 2, "Phone")
            menu?.add(0, 3, 3, "Email")
        }

        fun onContextItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                else -> return true
            }
        }


    }


    override fun getItemCount(): Int {
        return mails.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout =
            LayoutInflater.from(parent.context).inflate(R.layout.mail_list_item, parent, false)

        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mail = mails[position]
        holder.itemView.layoutParams.height = 150
        holder.itemView.forceLayout()
        holder.tvName.text = mail.name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ContactDetailActivity::class.java)
            intent.putExtra("email", mail.email)
            intent.putExtra("name", mail.email)
            intent.putExtra("id", mail.id.toString())
            intent.putExtra("phone", mail.phoneNumber)
            holder.itemView.context.startActivity(intent)
        }

    }
}
