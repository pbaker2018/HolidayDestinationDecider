package com.example.holidaydestinationdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val destinationList = arrayListOf("Fiji", "St Lucia", "Northern Lights", "QM2", "New Zealand", "Japan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whereToBtn.setOnClickListener {
            val random = Random()
            val randomDestination = random.nextInt(destinationList.count())
            selectedDestinationTxt.text = destinationList[randomDestination]
        }

        addDestinationBtn.setOnClickListener {
            val newDestination = addDestinationTxt.text.toString()
            destinationList.add(newDestination)
            addDestinationTxt.text.clear()
        }

    }
}
