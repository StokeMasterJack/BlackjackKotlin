package bj1

import org.junit.Test
import kotlin.test.assertEquals

class DeckTest {

    @Test
    fun t1() {
        val d1 = Deck()
        assertEquals(52, d1.size)

        val c1 = d1.take()
        println(c1.name)
        assertEquals(51, d1.size)

        val c2 = d1.take()
        println(c2.name)
        assertEquals(50, d1.size)

        println()

        renderDeck(d1)

    }

    private fun renderDeck(d1: Deck) {
        d1.cards.forEach { println(it.name) }
    }


}

