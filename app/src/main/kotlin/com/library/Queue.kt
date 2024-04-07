package com.library

class Queue {
    private val books: MutableList<Book> = mutableListOf()

    fun isEmpty(): Boolean = books.isEmpty()

    fun enqueue(book: Book) {
        books.add(index = books.lastIndex + 1, element = book)
    }

    fun dequeue(): Book? {
        return books.removeFirstOrNull()
    }
}