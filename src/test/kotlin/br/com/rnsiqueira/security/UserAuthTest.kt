package br.com.rnsiqueira.security

import br.com.rnsiqueira.ApplicationRun
import io.restassured.RestAssured.baseURI
import io.restassured.RestAssured.given
import org.json.JSONObject
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(classes = [ApplicationRun::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class UserAuthTest {
    @LocalServerPort
    private val portAppTest: Int? = null

    @BeforeEach
    fun setUp() {
        if (portAppTest != null) {
            baseURI = "http://localhost:$portAppTest/api"
        }
    }

    @Test
    fun `authenticated user`() {
        val jsonObject = JSONObject()
        jsonObject.append("username", "userTest")
        jsonObject.append("password", "passTest")

        val response =
            given().header("Content-type", "application/json").and().body(jsonObject)
                .`when`().post("/user/auth").then().extract().response()

        println(response.statusCode)
    }
}
