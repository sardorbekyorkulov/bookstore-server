package com.company.bookstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookstoreServerApplication

fun main(args: Array<String>) {
    runApplication<BookstoreServerApplication>(*args)
}
