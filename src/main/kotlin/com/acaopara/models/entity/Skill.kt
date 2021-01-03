package com.acaopara.models.entity

import java.util.Date
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
    var userId: Long = 0

    //todo
    var sysOccupationAreasId: Long = 0
    var manual: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null


}