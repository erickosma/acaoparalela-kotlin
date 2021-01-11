package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    var id: Long = 0
    lateinit var name: String
    lateinit var email: String
    @Column(name = "email_verified_at")
    var emailVerifiedAt: Date? = null
    var password: String = ""
    @Column(name = "remember_token")
    var rememberToken: String? = null
    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
    @Column(name = "deleted_at")
    var deletedAt: Date? = null

}