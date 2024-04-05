package com.library

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.BeforeTest
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.assertNull

class Library1Test {

    @Test
    fun testAddBook() {
        val library = Library()
        val book = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)

        library.addBook(book)

        assertEquals(1, library.getBookCount())
    }

    @Test
    fun testRemoveBook() {
        val library = Library()
        val book = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)

        library.addBook(book)
        library.removeBook(book)

        assertEquals(0, library.getBookCount())
    }
}

class Library2Test {

    @Test
    fun testAddBook() {
        val library = Library()
        val book = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)

        library.addBook(book)

        assertEquals(1, library.getBookCount())
    }

    @Test
    fun testRemoveBook() {
        val library = Library()
        val book = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)

        library.addBook(book)
        library.removeBook(book)

        assertEquals(0, library.getBookCount())
    }

    @Test
    fun testGetBookCount() {
        val library = Library()
        val book1 = Book("Book 1", "Author 1", 2000)
        val book2 = Book("Book 2", "Author 2", 2010)

        library.addBook(book1)
        library.addBook(book2)

        assertEquals(2, library.getBookCount())
    }

    @Test
    fun testFindBook() {
        val library = Library()
        val book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)
        val book2 = Book("To Kill a Mockingbird", "Harper Lee", 1960)

        library.addBook(book1)
        library.addBook(book2)

        val foundBook = library.findBook("To Kill a Mockingbird")

        assertNotNull(foundBook)
        assertEquals("To Kill a Mockingbird", foundBook.title)
    }

    @Test
    fun testPrintBooks() {
        val library = Library()
        val book1 = Book("Book 1", "Author 1", 2000)
        val book2 = Book("Book 2", "Author 2", 2010)

        library.addBook(book1)
        library.addBook(book2)

        // Redirect the standard output to capture printed books
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        library.printBooks()

        val printedBooks = outputStream.toString().trim()
        assertEquals("Book 1\nBook 2", printedBooks)

        // Reset the standard output
        System.setOut(System.out)
    }
}

class QueueTest {
    private lateinit var queue: Queue

    @BeforeTest
    fun setUp() {
        queue = Queue()
    }

    @Test
    fun testIsEmpty() {
        assertTrue(queue.isEmpty())

        queue.enqueue(Book("Book 1", "Author 1", 2000))

        assertFalse(queue.isEmpty())
    }

    @Test
    fun testEnqueueAndDequeue() {
        val book1 = Book("Book 1", "Author 1", 2000)
        val book2 = Book("Book 2", "Author 2", 2010)

        queue.enqueue(book1)
        queue.enqueue(book2)

        assertEquals(book1, queue.dequeue())
        assertEquals(book2, queue.dequeue())
        assertNull(queue.dequeue())
    }

    @Test
    fun testDequeueEmptyQueue() {
        assertNull(queue.dequeue())
    }
}

class StackTest {
    private lateinit var stack: Stack

    @BeforeTest
    fun setUp() {
        stack = Stack()
    }

    @Test
    fun testIsEmpty() {
        assertTrue(stack.isEmpty())

        stack.push(Book("Book 1", "Author 1", 2000))

        assertFalse(stack.isEmpty())
    }

    @Test
    fun testPushAndPop() {
        val book1 = Book("Book 1", "Author 1", 2000)
        val book2 = Book("Book 2", "Author 2", 2010)

        stack.push(book1)
        stack.push(book2)

        assertEquals(book2, stack.pop())
        assertEquals(book1, stack.pop())
        assertNull(stack.pop())
    }

    @Test
    fun testPopEmptyStack() {
        assertNull(stack.pop())
    }
}


