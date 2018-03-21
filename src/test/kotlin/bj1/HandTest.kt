package bj1

import kotlin.test.Test
import kotlin.test.assertEquals

class HandTest {

    @Test
    fun testHand() {
        val h1 = Hand(name = "Player")
        h1.add(Card(value = 1, suit = 1))
        h1.add(Card(value = 13, suit = 4))

        val h2 = Hand("Dealer")
        h2.add(Card(value = 1, suit = 1))
        h2.add(Card(value = 2, suit = 1))
        h2.add(Card(value = 3, suit = 1))

        assertEquals("Player", h1.name)
        assertEquals(11, h1.points)
        assertEquals(2, h1.size)

        assertEquals("Dealer", h2.name)
        assertEquals(6, h2.points)
        assertEquals(3, h2.size)

        renderHand(h1)
        println()
        renderHand(h2)

    }

    fun renderHand(h: Hand) {
        println("${h.name}  Hand")
        h.cards.forEach {
            println(it.name)
        }
        println("${h.points}  points")
    }

}

