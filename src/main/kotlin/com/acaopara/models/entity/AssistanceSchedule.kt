package com.acaopara.models.entity

import java.util.Date
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
    var assistanceId: Long = 0
    var schedule: Date? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
}