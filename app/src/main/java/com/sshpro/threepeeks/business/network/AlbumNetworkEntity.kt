package com.sshpro.threepeeks.business.network

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AlbumNetworkEntity(
    val id: Int,
    val userId: Int,
    val title: String
)