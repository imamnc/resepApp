package com.example.food

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = tambahData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter =
            ResepRVAdapter(testData) { resepItem: ResepData -> klikResepItem(resepItem) }
    }

    //Ketika klik Resep item menerima parameter resepItem, masuk ke ResepDetailActivity
    private fun klikResepItem(resepItem: ResepData) {
        val showDetailActivityIntent = Intent(this, ResepDetailActivity::class.java)
        //Kiriman Intent
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, resepItem.namaResep)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INDEX, resepItem.bahanResep)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.caraResep)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CHOSEN_COMPONENT, resepItem.image)
        //Menjalankan Activity showDetailActivityIntent
        startActivity(showDetailActivityIntent)
    }


}
