package com.acaopara.repository

import com.acaopara.models.entity.User
import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository: PanacheRepository<User> {
}