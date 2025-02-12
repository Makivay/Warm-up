package ru.makivay.warmup

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class RootController {
    @GetMapping fun ping(): String = "pong\n"
}