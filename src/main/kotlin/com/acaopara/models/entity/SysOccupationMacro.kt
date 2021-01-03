package com.acaopara.models.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "sys_occupation_macros")
class SysOccupationMacro {

    @Id
    @GeneratedValue
    var id: Long = 0
    var name: String? = null
}