package com.acaopara.models.entity

import com.acaopara.models.enums.ImaginableType
import java.util.Date
import javax.persistence.Column
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

    @Column(name = "imageable_id")
    var imaginableId: Long = 0
    @Column(name = "imageable_type")
    var imaginableType: ImaginableType? = null

    var type: String? = null

    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
}