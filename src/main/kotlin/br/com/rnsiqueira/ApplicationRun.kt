package br.com.rnsiqueira

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApplicationRun

fun main(args: Array<String>) {
    runApplication<ApplicationRun>(*args)
}
