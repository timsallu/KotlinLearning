package com.tim.kotlinlearning.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tim.kotlinlearning.Model.HobbiesModel
import com.tim.kotlinlearning.R
import kotlinx.android.synthetic.main.activity_recycle_container.view.*

class SimpleRecycleAdapter(val context: Context, val hobbies:List<HobbiesModel>,val textClickListener: TextClickListener) : RecyclerView.Adapter<SimpleRecycleAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val view : View = LayoutInflater.from(context).inflate(R.layout.activity_recycle_container,p0,false)
        val holder = ViewHolder(view, textClickListener)
        return holder
    }

    override fun getItemCount(): Int {

        return  hobbies.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val hobbiesModel = hobbies[p1]
       p0.setData(hobbiesModel,p1)
    }


    inner class ViewHolder(itemView: View,val textClickListener: TextClickListener) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener {

                textClickListener.OnTextClick(adapterPosition)
            }

            itemView.imgShare.setOnClickListener {


                val etText:String? = itemView.txvtitle.text.toString()

                etText?.let {  val intent= Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT,etText)
                    intent.type ="text/plain"

                    context.startActivity(Intent.createChooser(intent,"Share to:")) }
            }

        }
        fun setData(hobbiesModel: HobbiesModel? , pos: Int)
        {
            itemView.txvtitle.text=hobbiesModel?.name

        }

    }

    interface TextClickListener
    {
        fun OnTextClick( pos: Int)
    }
}