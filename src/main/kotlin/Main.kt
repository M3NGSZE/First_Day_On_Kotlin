package com.mengse.java

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun main() {

    val service = Service();

    println("========= SET UP LIBRARY =========")
    val name = service.library("Library's Name")
    val address = service.library("Library's Address")

    val date = SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH)
    val currentDate = date.format(Date())

    println("$name Library is already created in $address address successfully $currentDate")

}
