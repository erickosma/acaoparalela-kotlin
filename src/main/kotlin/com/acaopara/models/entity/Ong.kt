package com.acaopara.models.entity

import java.util.Date
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "ongs")
class Ong {

    @Id
    @GeneratedValue
    var id: Long = 0

    @OneToOne(cascade = arrayOf(CascadeType.ALL))
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    lateinit var user: User
    var fantasyName: String? = null
    var companyName: String? = null
    var description: String? = null
    var site: String? = null
    var createdAt:  Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}