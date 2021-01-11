package com.acaopara.models.entity

import java.sql.Timestamp
import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "voluntaries")
class Voluntary {

    @Id
    @GeneratedValue
    var id: Long = 0

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    lateinit var user: User

    var objective: String? = null
    var description: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}