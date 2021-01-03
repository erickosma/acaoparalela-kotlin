package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "sys_manual_occupation_areas")
class SysManualOccupationArea {

    @Id
    @GeneratedValue
    var id: Long = 0
    var name: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
}