package com.github.jszczepankiewicz.ceres

/**
 * @since 2018-02-03
 * @author jszczepankiewicz
 */
data class Service(val name:String, val versions:Set<String>, val healthyInstances:Int, val unHealthyInstances:Int)