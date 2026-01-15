package com.company.bookstore.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

// Class yonidan e'lon qilinadigan konstructor primary constructor deyiladi, qolganlari secondary constructor
@Entity
@Table(name = "authors")
data class Author(

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    var id: Long?,
    @Column(name = "name")
    var name: String,
    @Column(name = "age")
    var age: Int,
    @Column(name = "description")
    var description: String,
    @Column(name = "image")
    var image: String
)

