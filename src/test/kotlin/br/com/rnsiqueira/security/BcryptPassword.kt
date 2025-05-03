package br.com.rnsiqueira.security

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class BcryptPassword {


    @Test
    fun `Password encode bcryp`() {

        // Create an encoder with strength 16
        var encoder = BCryptPasswordEncoder(16);
        var result = encoder.encode("myPassword");
        assertTrue(encoder.matches("myPassword", result));
        print(result)

    }
}