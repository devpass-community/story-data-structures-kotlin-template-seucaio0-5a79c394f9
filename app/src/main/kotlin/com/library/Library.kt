package com.library

class Library {
    private val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book): Boolean {
        return books.add(book)
    }

    fun removeBook(book: Book) {
        books.removeIf { it == book }
    }

    fun getBookCount(): Int = books.count()

    fun findBook(title: String): Book? = books.find { it.title == title }

    fun printBooks() = books.forEach { println(it.title) }
}