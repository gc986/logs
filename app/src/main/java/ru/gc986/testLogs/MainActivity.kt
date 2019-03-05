package ru.gc986.testLogs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.VISIBLE
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import ru.gc986.logs.Logs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btSendLogClick(view: View){
        tvInfo.visibility = VISIBLE
        Logs.TAG = "Hello_Logs"
        Logs.i("Click >>> ${(view as Button).text}")
    }

}
