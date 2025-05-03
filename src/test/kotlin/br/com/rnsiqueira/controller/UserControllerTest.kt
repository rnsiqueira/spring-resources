package br.com.rnsiqueira.controller

import br.com.rnsiqueira.ApplicationRun
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.security.test.context.support.WithMockUser
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import java.util.*


@SpringBootTest(classes = arrayOf(ApplicationRun::class))
@AutoConfigureMockMvc
class UserControllerTest @Autowired constructor(val mockMvc: MockMvc) {

    @Test
    @WithMockUser(username = "app")
    fun `Users List`() {

        val response = mockMvc.perform(
            MockMvcRequestBuilders.get("/v1/api/users")
                .header("Basic", "app:appTest")
                .accept(MediaType.APPLICATION_JSON)
        )
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk())
            .andReturn()

        assertTrue(response.response.contentAsString.contains("root"))
        assertFalse(response.response.contentAsString.contains("anyUser"))


    }
}