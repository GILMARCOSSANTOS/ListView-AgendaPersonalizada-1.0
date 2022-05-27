package com.example.customlistview_agenda10

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
    private val context: Activity,
    private val arrayList: ArrayList<User>
) :
    ArrayAdapter<User>(context, R.layout.list_item, arrayList) {

    val inflater: LayoutInflater = LayoutInflater.from(context)
    val view = inflater.inflate(R.layout.list_item, null)

    val imageView = view.findViewById<View>(R.id.crclImgVw_profilePicture_listItem)
    val userName: TextView = view.findViewById(R.id.txtVw_name_listItem)

val lastMessage: TextView =





}