package com.acaopara.repository

import com.acaopara.TransactionalQuarkusTest
import com.acaopara.models.entity.User
import io.quarkus.test.common.QuarkusTestResource
import io.quarkus.test.h2.H2DatabaseTestResource
import org.junit.jupiter.api.Test

import javax.inject.Inject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach

@TransactionalQuarkusTest
@QuarkusTestResource(H2DatabaseTestResource::class)
class UserRepositoryTest {

    @Inject
    lateinit var userRepository: UserRepository

    @Inject
    lateinit var stateRepository: StateRepository

    @AfterEach
    fun clearDatabase() {
        userRepository.deleteAll()
    }


    @Test
    fun `find all states`() {
        val all  = stateRepository.findAll()

        assertThat(all.count())
            .isEqualTo(27L)
    }

    @Test
    fun `entity can be persist and found by id`() {
        val user = User()
        user.name = "Name teste"
        user.email = "teste@teste.com"

        userRepository.persist(user)

        val foundUser = userRepository.findAll().firstResult<User>()

        assertThat(foundUser.name)
            .isEqualTo(user.name)
        assertThat(foundUser.email)
            .isEqualTo(user.email)
    }
}