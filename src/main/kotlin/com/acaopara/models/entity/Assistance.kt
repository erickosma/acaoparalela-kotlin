package com.acaopara.models.entity

import com.acaopara.models.enums.AssistanceType
import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "assistances")
class Assistance {
    @Id
    @GeneratedValue
    var id: Long = 0
    @Column(name = "user_id")
    var userId: Long = 0
    var title: String? = null
    var description: String? = null
    //todo

    @Column(name = "sys_occupation_areas_id")
    var sysOccupationAreasId: Long = 0
    var manual: String? = null
    var type: AssistanceType? = null
    @Column(name = "created_at")
    var createdAt: Date? = Date()
    @Column(name = "updated_at")
    var updatedAt: Date? = null
}