package com.company.bookstore.services

import com.company.bookstore.domain.entities.AuthorEntity

interface AuthorService {

    fun save(authorEntity: AuthorEntity): AuthorEntity

}