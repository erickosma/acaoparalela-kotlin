package com.acaopara.models.entity

import java.util.Date
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table


@Entity
@Table(name = "sys_occupation_areas")
class SysOccupationArea {

    @Id
    @GeneratedValue
    var id: Long = 0
    var name: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "sys_macro_id", referencedColumnName = "id")
    var sysMacro: SysOccupationArea? = null
}