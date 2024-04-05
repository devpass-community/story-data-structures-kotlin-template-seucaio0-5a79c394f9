package com.library

fun main() {
    val book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)
    val book2 = Book("1984", "George Orwell", 1949)
    val book3 = Book("Pride and Prejudice", "Jane Austen", 1813)
    val book4 = Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997)

    val bookList = listOf(book1, book2, book3, book4)

    for (book in bookList) {
        println("Title: ${book.title}, Author: ${book.author}, Year: ${book.publicationYear}")
    }
}
