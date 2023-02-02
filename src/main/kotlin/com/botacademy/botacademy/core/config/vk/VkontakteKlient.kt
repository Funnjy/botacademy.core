package com.botacademy.botacademy.core.config.vk

import com.vk.api.sdk.client.TransportClient
import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.httpclient.HttpTransportClient


class VkontakteKlient {

    fun getVkKlient(): VkApiClient {
        val transportClient: TransportClient = HttpTransportClient.getInstance()
        return VkApiClient(transportClient)
    }
}