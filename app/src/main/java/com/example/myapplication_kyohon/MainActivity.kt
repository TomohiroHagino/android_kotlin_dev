package com.example.myapplication_kyohon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener {
            // ここに任意の処理を実装する。
            var isValid = true
            val priceEditText = findViewById<EditText>(R.id.price)
            val priceText = priceEditText.text.toString()

            if (priceText.isEmpty()) {
                // 定価が未入力だったとき
                priceEditText.error = getString(R.string.price_error)
                isValid = false
            }

            val discountEditText = findViewById<EditText>(R.id.discount)
            val discountText = discountEditText.text.toString()

            if (discountText.isEmpty()) {
                // 割引率が未入力だったとき
                discountEditText.error = getString(R.string.discount_error)
                isValid = false
            }

            if (isValid) {
                // 文字列を整数型に変換
                val price = Integer.parseInt(priceText)
                val discount = Integer.parseInt(discountText)

                // ここで画面遷移を行う。
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("price", price)
                intent.putExtra("discount", discount)
                startActivity(intent)

            }
        }

    }
}
