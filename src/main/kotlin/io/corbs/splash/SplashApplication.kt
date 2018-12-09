package io.corbs.splash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SplashApplication

fun main(args: Array<String>) {
    runApplication<SplashApplication>(*args)
}
