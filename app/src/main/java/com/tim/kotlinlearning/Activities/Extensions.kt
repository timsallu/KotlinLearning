package com.tim.kotlinlearning.Activities

import android.app.Activity
import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.showToast(msg : String)
{
    Toast.makeText(applicationContext,msg, Toast.LENGTH_LONG).show()
}



fun Activity.showLog(msg: String)
{
    Log.d("Salman", msg)
}