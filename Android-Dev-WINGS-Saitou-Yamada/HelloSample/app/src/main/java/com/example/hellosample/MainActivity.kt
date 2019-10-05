package com.example.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClick = findViewById<Button>(R.id.btClick)
        val listener = HelloListener()
        btClick.setOnClickListener(listener)

        // クリアボタンであるButtonオブジェクトを取得
        val btClear = findViewById<Button>(R.id.btClear)
        btClear.setOnClickListener(listener)


    }

    private inner class HelloListener : View.OnClickListener {
        override fun onClick(view: View?) {
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.tvOutput)


            if (view != null) {
                when(view.id) {
                    // 表示ボタンの場合
                    R.id.btClick -> {
                        val inputStr = input.text.toString()
                        output.text = inputStr + "さん、こんにちは"
                    }
                    // クリアボタンの場合
                    R.id.btClear -> {
                        input.setText("")
                        output.text = ""
                    }
                }
            }


        }
    }

}
