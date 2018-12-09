package io.corbs.splash

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WelcomeController {

    @Value("\${application.message}")
    private val MESSAGE = ""

    @Value("\${application.title}")
    private val TITLE = ""

    @GetMapping("/")
    fun welcome(model: MutableMap<String, Any>): String {
        model["title"] = TITLE
        model["message"] = MESSAGE
        return "Howdy"
    }

    // test 5xx errors
    @GetMapping("/5xx")
    fun ServiceUnavailable(): String {
        throw RuntimeException("AhHa!")
    }

}