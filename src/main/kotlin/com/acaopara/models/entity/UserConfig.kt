package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user_configs")
class UserConfig {

    @Id
    @GeneratedValue
    var id: Long = 0
    @Column(name = "user_id")
    var userId: Long = 0
    var confidentialAddress: Long = 0
    var confidentialEmail: Long = 0
    var confidentialPhone: Long = 0
    var confidentialNotification: Long = 0

    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
    @Column(name = "deleted_at")
    var deletedAt: Date? = null
}