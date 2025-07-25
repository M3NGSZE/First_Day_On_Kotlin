package com.mengse.java

data class Book(val id: Int, val title: String, val author: Author, val published: String, val status: Int)

data class  Author(val name: String, val active: String)