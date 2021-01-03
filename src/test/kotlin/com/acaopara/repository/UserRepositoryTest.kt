package com.acaopara.repository

import com.acaopara.TransactionalQuarkusTest
import com.acaopara.models.entity.User
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import javax.enterprise.inject.Default
import javax.inject.Inject
import org.assertj.core.api.Assertions.assertThat

@TransactionalQuarkusTest
class UserRepositoryTest {

    @Inject
    @field: Default
    lateinit var userRepository: UserRepository

    @BeforeEach
    fun clearDatabase() { userRepository.deleteAll() }

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