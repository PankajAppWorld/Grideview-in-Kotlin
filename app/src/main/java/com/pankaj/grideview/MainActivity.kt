package com.pankaj.grideview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var grideview : GridView? = null
    private var learningcourcesname = arrayOf("Android","Java","Kotlin","Flutter")
    private var learningcourceimages = intArrayOf(R.drawable.ic_android,
        R.drawable.ic_java,R.drawable.ic_kotlin,R.drawable.ic_flutter,)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         grideview = findViewById(R.id.gridView);
         var adapter = MyAdapter(this,learningcourcesname,learningcourceimages)
         grideview!!.adapter = adapter
         grideview!!.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                applicationContext, "You CLicked - " + learningcourcesname[+position],
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}