package com.launchAggregator.aggregator.client

import com.launchAggregator.aggregator.model.SpacexModel
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping


@FeignClient(name="spacex", url="\${app.spacex.url}")
interface SpacexClient {
    @GetMapping()
    fun getRelaunches(): List<SpacexModel>
}