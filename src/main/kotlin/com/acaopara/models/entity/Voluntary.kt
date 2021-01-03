package com.acaopara.models.entity

import java.sql.Timestamp
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "voluntaries")
class Voluntary {

    @Id
    @GeneratedValue
    var id: Long = 0
    var userId: Long = 0
    var objective: String? = null
    var description: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}