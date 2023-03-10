package com.example.movieranking

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import io.mockk.MockKAnnotations
import io.mockk.called
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class LoginViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private lateinit var viewModel: LoginViewModel

    @MockK
    private lateinit var navigateToHomeObserver: Observer<String>

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        viewModel = LoginViewModel()
    }

    @Test
    fun `Given username is not null _navigateToHome should emit with username`() {
        // Given
        val username = "Anne"
        viewModel.navigateToHome.observeForever(navigateToHomeObserver)
        every { navigateToHomeObserver.onChanged(any()) } answers {}

        // When
        viewModel.validateUsername(username)

        // Then
        assertEquals("Anne", viewModel.navigateToHome.value)
        verify {
            navigateToHomeObserver.onChanged(username)
        }
    }

    @Test
    fun `Given username is empty _navigateToHome should not emit`() {
        // Given
        val username = ""
        viewModel.navigateToHome.observeForever(navigateToHomeObserver)
        every { navigateToHomeObserver.onChanged(any()) } answers {}

        // When
        viewModel.validateUsername(username)

        // Then
        assertEquals(null, viewModel.navigateToHome.value)
        verify {
            navigateToHomeObserver wasNot called
        }
    }
}