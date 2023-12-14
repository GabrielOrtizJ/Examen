package com.example.examen_gabriel.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.examen_gabriel.R
import com.example.examen_gabriel.model.Planeta

class PlanetaAdapter(private val activity: Activity,private val listaPlaneta: ArrayList<Planeta>):BaseAdapter() {
  class ViewHolder{
      lateinit var textNombre: TextView
      lateinit var textTipoPlaneta: TextView
  }

    override fun getCount(): Int {
        return listaPlaneta.size
    }

    override fun getItem(position: Int): Any {
        return listaPlaneta.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var myView = convertView
        var viewHolder = ViewHolder()

        if(myView==null){
            var inflater = activity.layoutInflater
            myView = inflater.inflate(R.layout.item_planeta_layout,null)

            viewHolder.textNombre = myView.findViewById<TextView>(R.id.textViewNombre)
            viewHolder.textTipoPlaneta = myView.findViewById<TextView>(R.id.textViewTipoPlaneta)

            myView.setTag(viewHolder)
        }

        viewHolder = myView?.tag as ViewHolder

        return  myView!!
    }


}