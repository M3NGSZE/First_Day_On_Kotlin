package com.mengse.java

class Service{
    fun library(arg: String): String?{
        val msg = "$arg can't be empty and can't be start with number or only number"
        while (true){
            print("=> Enter $arg: ")
            val li = readln()
            val matches = li.matches(Regex("^[a-zA-Z][a-zA-Z0-9 ]*$"))
            if (matches){
                return li
            }else{
                println(msg)
            }
        }
    }
}