package com.acaopara.models.entity

import com.acaopara.models.enums.ImaginableType
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "images")
class Images {
    @Id
    @GeneratedValue
    var id: Long = 0
    var url: String? = null
    //todo motph
    var imageableId: Long = 0
    var imaginableType: ImaginableType? = null
    var type: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
}