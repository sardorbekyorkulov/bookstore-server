package com.company.bookstore

import com.company.bookstore.domain.dto.AuthorDto
import com.company.bookstore.domain.entities.AuthorEntity

//fun AuthorEntity.toAuthorDto(): AuthorDto {
//    return AuthorDto(
//        id = this.id,
//        name = this.name,
//        age = this.age,
//        description = this.description,
//        image = this.image
//    )
//}

// Yuqoridagini mana bunaqa qilib o'zgartirsak ham bo'ladi.

fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)


fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)