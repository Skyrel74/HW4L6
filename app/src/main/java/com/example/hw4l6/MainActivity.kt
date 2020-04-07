package com.example.hw4l6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.round

class MainActivity : AppCompatActivity(), ProductView {
    private val presenter = CartPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.printAllProducts()
        presenter.printTotalPrice()
    }

    override fun print(price: Double) {
        Log.d("App Output",
            if (price - price.toInt() == 0.0) "${price.toInt()}P"
            else "${round(price * 100) / 100}P")
    }

    override fun print(name: String, price: Double) {
        Log.d("App Output","$name: " +
                if (price - price.toInt() == 0.0) "${price.toInt()}P"
                else "${round(price * 100) / 100}P")
    }
}
