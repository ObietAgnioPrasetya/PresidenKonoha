package com.example.presidenkonoha

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*

class Adapter(val listPresidenKonoha:ArrayList<PresidenKonoha>, val context: Context?) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val presidenkonoha=listPresidenKonoha[p0]
        val inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        val myView=inflator.inflate(R.layout.item,null)
        myView.imgPresidenKonoha.setImageResource(presidenkonoha.gambar!!)
        myView.txtJudul.text=presidenkonoha.nama!!
        myView.txtDeskripsi.text=presidenkonoha.deskripsi!!
        myView.setOnClickListener {
            val intent=Intent(context,Profilpresidenkonoha::class.java)
            intent.putExtra("imgPresidenKonoha",presidenkonoha.gambar!!)
            intent.putExtra("txtJudul",presidenkonoha.nama!!)
            intent.putExtra("txtDeskripsi",presidenkonoha.deskripsi!!)
            context.startActivity(intent)
        }
        return myView
    }

    override fun getItem(p0: Int): Any {
        return listPresidenKonoha[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listPresidenKonoha.size
    }

}