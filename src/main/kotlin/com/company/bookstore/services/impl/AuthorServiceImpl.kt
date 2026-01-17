package com.company.bookstore.services.impl

import com.company.bookstore.domain.entities.AuthorEntity
import com.company.bookstore.repositories.AuthorRepository
import com.company.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(
    private val authorRepository: AuthorRepository  // bu primary constructor
) : AuthorService {

    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }

}