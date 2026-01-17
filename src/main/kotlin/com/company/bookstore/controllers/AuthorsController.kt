package com.company.bookstore.controllers

import com.company.bookstore.domain.dto.AuthorDto
import com.company.bookstore.services.AuthorService
import com.company.bookstore.toAuthorDto
import com.company.bookstore.toAuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(
    private val authorService: AuthorService
) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): AuthorDto {
        return authorService
            .save(authorDto.toAuthorEntity())
            .toAuthorDto()
    }
}