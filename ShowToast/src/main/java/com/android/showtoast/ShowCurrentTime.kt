package com.android.showtoast

class ShowCurrentTime {

    companion object {
        fun currentTime(): String {
            return System.currentTimeMillis().toString()
        }
    }
}