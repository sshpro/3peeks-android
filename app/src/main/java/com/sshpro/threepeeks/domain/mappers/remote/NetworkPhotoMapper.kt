package com.sshpro.threepeeks.domain.mappers.remote

import com.sshpro.threepeeks.domain.model.Photo
import com.sshpro.threepeeks.data.remote.dto.PhotoNetworkEntity
import com.sshpro.threepeeks.domain.mappers.Mapper
import javax.inject.Inject

class NetworkPhotoMapper
@Inject
constructor() : Mapper<PhotoNetworkEntity, Photo> {

    override fun mapToDomain(
        input: PhotoNetworkEntity
    ): Photo {
        return Photo(
            id = input.id,
            albumId = input.albumId,
            title = input.title,
            url = input.url
        )
    }
}