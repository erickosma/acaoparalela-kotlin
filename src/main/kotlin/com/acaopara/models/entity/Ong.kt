package com.acaopara.models.entity

import java.util.Date
import javax.persistence.CascadeType
import javax.persistence.Column
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

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    lateinit var user: User

    @Column(name = "fantasy_name")
    var fantasyName: String? = null
    @Column(name = "company_name")
    var companyName: String? = null
    var description: String? = null
    var site: String? = null
    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
    @Column(name = "deleted_at")
    var deletedAt: Date? = null
}