package com.acaopara.models.entity

import com.acaopara.models.enums.AssistanceType
import java.util.Date
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
    var userId: Long = 0
    var title: String? = null
    var description: String? = null
    //todo
    var sysOccupationAreasId: Long = 0
    var manual: String? = null
    var type: AssistanceType? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
}