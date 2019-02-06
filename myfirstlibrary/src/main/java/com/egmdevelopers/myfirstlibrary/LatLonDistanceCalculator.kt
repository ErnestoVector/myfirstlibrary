package com.egmdevelopers.myfirstlibrary

object LatLonDistanceCalculator {

    private val TAG = LatLonDistanceCalculator::class.java.simpleName
    const val EARTH_RADIUS_IN_KILOMETERS = 6371

    fun calculateDistance(pointA: Point, pointB: Point): Double {
        val lat = Math.toRadians(pointB.latitude - pointA.latitude)
        val lng = Math.toRadians(pointB.longitude - pointA.longitude)
        val a = Math.sin(lat / 2) * Math.sin(lat / 2) +
                Math.cos(Math.toRadians(pointA.latitude)) *
                Math.cos(Math.toRadians(pointB.latitude)) *
                Math.sin(lng / 2) * Math.sin(lng / 2)
        val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))

        return (EARTH_RADIUS_IN_KILOMETERS * c)
    }
}