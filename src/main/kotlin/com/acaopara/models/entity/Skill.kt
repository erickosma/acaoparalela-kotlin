package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "skills")
class Skill {

    @Id
    @GeneratedValue
    var id: Long = 0

    @Column(name = "user_id")
    var userId: Long = 0

    @Column(name = "sys_occupation_areas_id")
    var sysOccupationAreasId: Long = 0
    var manual: String? = null
    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null

}