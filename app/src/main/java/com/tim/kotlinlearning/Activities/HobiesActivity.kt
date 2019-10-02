package com.tim.kotlinlearning.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import com.tim.kotlinlearning.Adapters.SimpleRecycleAdapter
import com.tim.kotlinlearning.Model.Supplier
import com.tim.kotlinlearning.R
import kotlinx.android.synthetic.main.activity_hobies.*

class  HobiesActivity : AppCompatActivity(), SimpleRecycleAdapter.TextClickListener
{

    override fun OnTextClick(pos: Int) {
        showLog("Pos: $pos")
        showToast("pos: ${Supplier.hobbiesList[pos]}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobies)

        setUpRecycleview()
    }

    fun setUpRecycleview()
    {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation= LinearLayoutManager.VERTICAL

        recycleview.layoutManager=layoutManager
        val simpleRecycleAdapter =
            SimpleRecycleAdapter(this, Supplier.hobbiesList, this)
        recycleview.adapter= simpleRecycleAdapter
    }
}