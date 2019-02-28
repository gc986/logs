package ru.gc986.testLogs

import android.app.Application
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*
import ru.gc986.logs2.Logs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btSendLogClick(view: View){
        tvInfo.visibility = VISIBLE
        Logs.TAG = "MyApp"
        Logs.i("SeNd_MeSsAgE_>>>")
    }

}
