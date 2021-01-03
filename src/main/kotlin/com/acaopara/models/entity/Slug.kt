package com.acaopara.models.entity

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "slugs")
class Slug {

    @Id
    @GeneratedValue
    var id: Long = 0
    var slugableId: Long = 0
    var slugableType: String? = null
    var title: String? = null
    var titleSlug: String? = null
    var createdAt: Date? = Date()
    var updatedAt: Date? = null
    var deletedAt: Date? = null
}