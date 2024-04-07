package com.library

class Stack {
    private val books: MutableList<Book> = mutableListOf()

    fun isEmpty(): Boolean = books.isEmpty()

    fun push(book: Book) {
        books.add(index = 0, element = book)
    }

    fun pop(): Book? {
        return books.removeFirstOrNull()
    }
}