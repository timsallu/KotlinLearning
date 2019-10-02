package com.tim.kotlinlearning.Activities

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.tim.kotlinlearning.Constans.EditTextValue
import com.tim.kotlinlearning.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {

            showLog("Button Click")
            showToast("btnShowToast")
        }

        btnnavigate.setOnClickListener {

            val etText:String? = ethelloworld.text.toString()
            val intent = Intent(applicationContext, Main2Activity::class.java)

            intent.putExtra(EditTextValue,etText)
            startActivity(intent)

        }

        implicitbtn.setOnClickListener {

            val etText:String? = ethelloworld.text.toString()

            val intent= Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,etText)
            intent.type ="text/plain"

            startActivity(Intent.createChooser(intent,"Share to:"))

        }

        btnrecyclevieweg.setOnClickListener {

            val inten: Intent = Intent(this, HobiesActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.setting,menu)
        val menu1:MenuItem? = menu?.findItem(R.id.menu_setting)
        menu1?.setEnabled(false)


        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val menu1:MenuItem? = menu?.findItem(R.id.menu_setting)
        menu1?.setEnabled(true)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId)
        {
          android.R.id.home ->
          {
              if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                  finishAffinity()
              }
          }

          R.id.menu_setting ->
          {
              showLog("setting menu")
          }
            else ->
            {

            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {

         val builder: AlertDialog.Builder = AlertDialog.Builder(this)
          builder.setTitle("Dialog")
          builder.setIcon(R.mipmap.ic_launcher)
          builder.setCancelable(false)
       //   builder.setPositiveButton()
        builder.show()
        super.onBackPressed()
    }


}
