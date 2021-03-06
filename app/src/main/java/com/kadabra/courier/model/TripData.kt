package com.kadabra.courier.model

import android.util.Log
import com.kadabra.courier.R
import com.kadabra.courier.utilities.AppController
import kotlinx.android.synthetic.main.activity_crash.view.*

class TripData {
    var days = 0L
    var hours = 0L
    var minutes = 0L
    var seconds = 0L
    var distance = 0

    constructor()
    constructor(days: Long, hours: Long, minutes: Long, seconds: Long, distance: Int) {
        this.days = days
        this.hours = hours
        this.minutes = minutes
        this.seconds = seconds
        this.distance = distance
    }

    fun getDuration(totalSeconds:Int ): String {
        var data = ""
        var days = totalSeconds / 86400
        var hours = (totalSeconds - days * 86400) / 3600
        var minutes = (totalSeconds - days * 86400 - hours * 3600) / 60
        var seconds = totalSeconds - days * 86400 - hours * 3600 - minutes * 60
        if (days > 0)
            data =
                days.toString() + AppController.getContext().resources.getString(R.string.day) + " "
        if (hours > 0)
            data += " $hours " + AppController.getContext().getString(R.string.hour) + " "
        if (minutes > 0)
            data += " $minutes " + AppController.getContext().getString(R.string.minutes) + "."
        Log.d("TripData",data)
        return data
    }
 fun getDuration(): String {
        var data = ""
        if (days > 0)
            data =
                days.toString() + AppController.getContext().getString(R.string.day) + " "
        if (hours > 0)
            data += " $hours " + AppController.getContext().getString(R.string.hour) + " "
        if (minutes > 0)
            data += " $minutes " + AppController.getContext().getString(R.string.minutes) + "."
        Log.d("TripData",data)
        return data
    }

//    override fun toString(): String {
//        var data = ""
//        if (days > 0)
//            data =
//                days.toString() + AppController.getContext().resources.getString(R.string.day) + " "
//        if (hours > 0)
//            data += " $hours " + AppController.getContext().resources.getString(R.string.hour) + " "
//        if (minutes > 0)
//            data += " $minutes " + AppController.getContext().resources.getString(R.string.minutes) + "."
//        return data
//    }
}