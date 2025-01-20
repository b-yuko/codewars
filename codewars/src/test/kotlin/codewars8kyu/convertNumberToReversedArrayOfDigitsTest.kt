package codewars8kyu

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConvertNumberToReversedArrayOfDigitsTest {
    @Test
    fun tests() {
        assertArrayEquals(intArrayOf(1, 3, 2, 5, 3), Kata.digitize(35231))
        assertArrayEquals(intArrayOf(0), Kata.digitize(0))
    }
}