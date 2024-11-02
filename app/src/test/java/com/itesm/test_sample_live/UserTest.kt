package com.itesm.test_sample_live

import org.junit.Assert.*
import org.junit.Test

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsNotAdult() {
        val user = User("John", 15)
        assertFalse(user.isAdult())
    }

    @Test
    fun testGetName() {
        val user = User("John", 20)
        assertEquals("John", user.name)
    }

}
