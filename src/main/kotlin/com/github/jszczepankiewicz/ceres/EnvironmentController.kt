package com.github.jszczepankiewicz.ceres

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.toFlux

/**
 * @since 2018-02-10
 * @author jszczepankiewicz
 */
@RestController
@RequestMapping(value = "/api/v1/environments")
class EnvironmentController(val environments: EnvironmentRepository) {

    @GetMapping("")
    fun all(): Flux<EnvironmentSnapshot> = this.environments.findAll().toFlux()
}