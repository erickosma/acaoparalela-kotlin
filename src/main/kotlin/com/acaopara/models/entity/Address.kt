package com.acaopara.models.entity

import com.acaopara.models.enums.AddressableType
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "addresses")
class Address {

    @Id
    @GeneratedValue
    var id: Long = 0
    var addressesbleId: Long = 0
    var addressesbleType: AddressableType? = null
    var address: String? = null
    var complement: String? = null
    var cityId: Long = 0
    var countryId: Long = 0
    var latitude = 0.0
    var longitude = 0.0
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}