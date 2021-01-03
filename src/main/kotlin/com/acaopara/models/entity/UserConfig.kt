package com.acaopara.models.entity

import java.util.Date
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
    var userId: Long = 0
    var confidentialAddress: Long = 0
    var confidentialEmail: Long = 0
    var confidentialPhone: Long = 0
    var confidentialNotification: Long = 0
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}