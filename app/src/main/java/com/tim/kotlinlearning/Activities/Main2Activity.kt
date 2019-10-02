package com.tim.kotlinlearning.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tim.kotlinlearning.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle:Bundle? = intent.extras

        bundle?.let {
            bundle.getString("ettxt")
        }


       val value: String= intent.extras.getString("ettxt")

        textView.text=value

    }
}
