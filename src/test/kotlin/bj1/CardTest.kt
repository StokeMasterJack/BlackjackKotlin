package bj1

import org.junit.Test
import kotlin.test.assertEquals

class CardTest {

    @Test
    fun t1() {

        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals("Ace", c1.valueName)

        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Diamonds", c2.suitName)
        assertEquals("King", c2.valueName)

    }

    @Test
    fun t2() {

        val r = 1..4

        println(r.contains(6))
        println(6 in r)

    }


}