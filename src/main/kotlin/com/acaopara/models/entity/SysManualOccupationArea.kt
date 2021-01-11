package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Column
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
    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
}