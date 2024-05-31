package org.example

import org.junit.Test
import kotlin.test.assertEquals

class Samples {
    @Test
    @OptIn(ExperimentalApi::class)
    fun expFunSample() {
        assertEquals(42, experimentalFunction())
    }
}
