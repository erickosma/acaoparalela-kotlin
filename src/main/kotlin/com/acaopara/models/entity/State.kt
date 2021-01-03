package com.acaopara.models.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "states")
class State {

    @Id
    @GeneratedValue
    var id: Long = 0
    var title: String? = null
    var letter: String? = null
    var iso: Long = 0
    var slug: String? = null
    var population: Long = 0
}