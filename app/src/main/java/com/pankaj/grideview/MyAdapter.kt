package com.pankaj.grideview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context:Context,private val courcesname :Array<String>,
                private val courcesimages :IntArray) : BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun getCount(): Int {
        return courcesname.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        var convertView = convertview
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.row_item, null)
        }
        imageView = convertView!!.findViewById(R.id.imageView)
        textView = convertView.findViewById(R.id.textView)
        imageView.setImageResource(courcesimages[position])
        textView.text = courcesname[position]
        return convertView
    }
}