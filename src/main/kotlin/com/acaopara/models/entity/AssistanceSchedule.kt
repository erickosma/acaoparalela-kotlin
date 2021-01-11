package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "assistance_schedules")
class AssistanceSchedule {
    @Id
    @GeneratedValue
    var id: Long = 0
    @Column(name = "assistance_id")
    var assistanceId: Long = 0
    var schedule: Date? = null
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
}