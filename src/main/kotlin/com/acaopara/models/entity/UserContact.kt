package com.acaopara.models.entity

import java.sql.Timestamp
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "user_contacts")
class UserContact {
    @Id
    @GeneratedValue
    var id: Long = 0
    var userId: Long = 0
    var description: String? = null
    var type: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}