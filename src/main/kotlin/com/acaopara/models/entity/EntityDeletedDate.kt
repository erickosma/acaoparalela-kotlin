package com.acaopara.models.entity

import java.util.*
import javax.persistence.Column

open class EntityDeletedDate: EntityDate() {

    @Column(name = "deleted_at")
    var deletedAt: Date? = null
}