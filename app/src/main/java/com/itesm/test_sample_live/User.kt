package com.itesm.test_sample_live

class User(val name: String, val age: Int) {

    fun isAdult(): Boolean {
        return age >= 18
    }
}
