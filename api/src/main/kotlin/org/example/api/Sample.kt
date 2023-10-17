package org.example.api

class Sample {
    internal var field: String = "initial"
    fun field(value: String) = apply {
        this.field = value
    }
}
