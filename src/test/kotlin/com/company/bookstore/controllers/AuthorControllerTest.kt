package com.company.bookstore.controllers

import com.company.bookstore.domain.dto.AuthorDto
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post
import tools.jackson.databind.ObjectMapper

@SpringBootTest
@AutoConfigureMockMvc
class AuthorControllerTest @Autowired constructor(private val mockMvc: MockMvc) {

    // Kotlin objectni JSON ga aylantirish uchun
    val objectMapper = ObjectMapper()

    @Test
    fun `test that create Author returns a HTTP 201 status on a successful create`() {
        mockMvc.post("/v1/authors") {
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                AuthorDto(
                    null,
                    "John Doe",
                    40,
                    "Very Good Author",
                    "john-doe.jpg"
                )
            )
        }.andExpect {
            status { isCreated() }
        }
    }
}


/*
@AutoConfigureMockMvc
Bu nima uchun kerak?
Odatda, Spring Boot dasturini test qilish uchun uni haqiqatda ishga tushirib, ma'lum bir portda (masalan, 8080) kutish kerak bo'ladi. @AutoConfigureMockMvc esa:
Serverni (Tomcat) to'liq ishga tushirmasdan, Spring MVC infrastrukturasini imitatsiya (Mock) qiladi.
Sizga serverga HTTP so'rovlar (GET, POST, etc.) yuborish va javoblarni tekshirish imkonini beradi.
Bu usul haqiqiy serverni yoqishdan ko'ra ancha tezroq ishlaydi.
* */