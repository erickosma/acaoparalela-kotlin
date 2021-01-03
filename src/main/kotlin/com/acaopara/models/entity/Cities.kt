package com.acaopara.models.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "cities")
class Cities {
    @Id
    @GeneratedValue
    var id: Long = 0
    var stateId: Long = 0
    var title: String? = null
    var iso: Long = 0
    var isoDdd: Long = 0
    var status: Long = 0
    var slug: String? = null
    var population: Long = 0
    val latitude = 0.0
    var longitude = 0.0
    var incomePerCapita = 0.0
}