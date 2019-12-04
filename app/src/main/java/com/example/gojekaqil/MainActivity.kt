package com.example.gojekaqil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonGoSend : LinearLayout
    private lateinit var buttonGoMart : LinearLayout
    private lateinit var buttonGoRide : LinearLayout
    private lateinit var buttonGoCar  : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoSend = findViewById(R.id.go_send)
        buttonGoMart = findViewById(R.id.go_mart)
        buttonGoRide = findViewById(R.id.go_ride)
        buttonGoCar  = findViewById(R.id.go_car)

        buttonGoSend.setOnClickListener(this)
        buttonGoMart.setOnClickListener(this)
        buttonGoRide.setOnClickListener(this)
        buttonGoCar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id)
        {
            R.id.go_send -> {
                val moveWithDataGoSend = Intent(this@MainActivity, go_send::class.java)
                moveWithDataGoSend.putExtra(go_send.EXTRA_NAMA, "Aqil")
                moveWithDataGoSend.putExtra(go_send.EXTRA_ALAMAT, "Semarang")
                moveWithDataGoSend.putExtra(go_send.EXTRA_NAMA_BARANG, "Iphone")
                moveWithDataGoSend.putExtra(go_send.EXTRA_JUMLAH, 1)
                startActivity(moveWithDataGoSend)
            }
            R.id.go_mart -> {
                val moveWithDataGoMart = Intent(this@MainActivity, go_mart::class.java)
                moveWithDataGoMart.putExtra(go_mart.EXTRA_NAMA, "Said")
                moveWithDataGoMart.putExtra(go_mart.EXTRA_ALAMAT, "Kalisari")
                moveWithDataGoMart.putExtra(go_mart.EXTRA_NAMA_BARANG, "Soto")
                moveWithDataGoMart.putExtra(go_mart.EXTRA_JUMLAH, 5)
                startActivity(moveWithDataGoMart)
            }
            R.id.go_ride -> {
                val moveWithDataGoRide = Intent(this@MainActivity, go_ride::class.java)
                moveWithDataGoRide.putExtra(go_ride.EXTRA_NAMA, "Aqil")
                moveWithDataGoRide.putExtra(go_ride.EXTRA_ALAMAT, "Bumi")
                moveWithDataGoRide.putExtra(go_ride.EXTRA_ALAMAT_TUJUAN, "Surga")
                startActivity(moveWithDataGoRide)
            }
            R.id.go_car -> {
                val moveWithDataGoCar = Intent(this@MainActivity, go_car::class.java)
                moveWithDataGoCar.putExtra(go_car.EXTRA_NAMA, "Aqil")
                moveWithDataGoCar.putExtra(go_car.EXTRA_ALAMAT, "Bandara")
                moveWithDataGoCar.putExtra(go_car.EXTRA_ALAMAT_TUJUAN, "Undip")
                startActivity(moveWithDataGoCar)
            }
        }

    }
}
