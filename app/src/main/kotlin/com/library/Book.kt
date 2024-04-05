package com.library

class Book(
        val title: String,
        val author: String,
        val publicationYear: Int,
        var isAvailable: Boolean = true
)