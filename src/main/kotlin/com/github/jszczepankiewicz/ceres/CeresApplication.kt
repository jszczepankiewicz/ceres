package com.github.jszczepankiewicz.ceres

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CeresApplication

fun main(args: Array<String>) {
    runApplication<CeresApplication>(*args)
}
