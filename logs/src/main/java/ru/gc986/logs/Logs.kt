package ru.gc986.logs

import android.util.Log

class Logs {

    companion object {

        var enable = true

        var TAG:String = "TAG"

        fun i(message:String){
            if (!enable) return
            try {
                Log.i(TAG, message)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun showAlways(message: String) {
            try {
                Log.i(TAG, message)
            } catch (e:Exception){
                e.printStackTrace()
            }
        }

        fun i(label: String, arr: Array<String>) {
            if (!enable) return
            try {
                for (i in arr.indices)
                    Log.i(TAG, label + " [" + i + "] : " + arr[i])
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun e(message: String) {
            if (!enable) return
            try {
                Log.e(TAG, message)
            } catch (e:Exception){
                e.printStackTrace()
            }
        }

    }

}