package ru.makivay.warmup

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WarmUpApplication

fun main(args: Array<String>) {
	runApplication<WarmUpApplication>(*args)
}
