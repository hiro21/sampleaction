package com.hiswing.sampleaction.api

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class HelloControllerTest {
    @Nested
    inner class `helloエンドポイントのtest` {
        @Test
        fun `エンドポイントにアクセスしたら、helloを返す`() {
            val helloController = HelloController()
            assertEquals("hello", helloController.hello())
        }
    }
}