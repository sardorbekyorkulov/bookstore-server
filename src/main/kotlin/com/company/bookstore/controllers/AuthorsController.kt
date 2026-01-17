package com.company.bookstore.controllers

import com.company.bookstore.domain.dto.AuthorDto
import com.company.bookstore.services.AuthorService
import com.company.bookstore.toAuthorDto
import com.company.bookstore.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(
    private val authorService: AuthorService
) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto> {
        val createdAuthor = authorService
            .save(authorDto.toAuthorEntity())
            .toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }
}