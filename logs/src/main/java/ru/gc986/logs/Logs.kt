package ru.gc986.logs2

import android.util.Log

class Logs {

    companion object {

        var TAG:String = "TAG"

        fun i(message:String){
            Log.i(TAG, message)
        }
    }

}