package com.giangptl.unittestingwithjunit

import junit.framework.TestCase
import org.junit.Test

class FunctionTest : TestCase() {

    private val functionTest = Function()

    @Test
    fun testAddFunction() {
        val result  = functionTest.addThreeNumbers(1, 2, 3.5f)
        assertEquals(6.5f, result)
    }

    @Test
    fun testMultiplyFunction() {
        val result  = functionTest.multiplyThreeNumbers(1, 2, 3.5f)
        assertEquals(7f, result)
    }
}