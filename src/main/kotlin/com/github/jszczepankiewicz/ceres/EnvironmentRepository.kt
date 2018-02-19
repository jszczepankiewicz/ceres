package com.github.jszczepankiewicz.ceres

import com.netflix.discovery.EurekaClient
import org.springframework.stereotype.Repository

/**
 * @since 2018-02-03
 * @author jszczepankiewicz
 */
@Repository
open class EnvironmentRepository(val eurekaClient: EurekaClient) {


    fun getEnvironmentInfo(eurekaUrl:String):EnvironmentSnapshot{

        val apps = eurekaClient.getApplications(eurekaUrl)
        apps.registeredApplications.forEach {
            val serviceName = it.name
            it.instances.forEach { instance ->
                instance.
            }
        }
    }

    private var sortedEnvironments:List<EnvironmentSnapshot> = emptyList()

    fun findAll():List<EnvironmentSnapshot>{
        return sortedEnvironments
    }

}