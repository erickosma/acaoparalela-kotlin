package com.acaopara.models.entity

import java.util.*
import javax.persistence.Column

open class EntityDate {

    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
}