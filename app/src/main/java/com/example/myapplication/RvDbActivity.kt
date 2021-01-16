package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RvDbActivity : AppCompatActivity() {
    private lateinit var rv_tampilan: RecyclerView
    lateinit var userDBHelper: DBHelper
    private var list: ArrayList<DBModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_db)

        rv_tampilan = findViewById(R.id.rv_tampil)
        rv_tampilan.setHasFixedSize(true)
        userDBHelper = DBHelper(this)
        list.addAll(userDBHelper.fullData())
        rv_tampilan.layoutManager = LinearLayoutManager(this)

        var cardData = DBAdapter(list)
        rv_tampilan.adapter = cardData

    }
}