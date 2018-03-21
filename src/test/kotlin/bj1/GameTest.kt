package bj1

import kotlin.test.Test
import kotlin.test.assertEquals

class GameTest {

    @Test
    fun testGame() {
        val g = Game(shuffle = false)
        assertEquals(48, g.deck.size)
        assertEquals(2, g.ph.size)
        assertEquals(2, g.dh.size)
        assertEquals(4, g.ph.points)
        assertEquals(6, g.dh.points)

        g.hit()
        assertEquals(47, g.deck.size)
        assertEquals(3, g.ph.size)
        assertEquals(2, g.dh.size)
        assertEquals(9, g.ph.points)
        assertEquals(6, g.dh.points)

        g.hit()
        assertEquals(46, g.deck.size)
        assertEquals(4, g.ph.size)
        assertEquals(2, g.dh.size)
        assertEquals(15, g.ph.points)
        assertEquals(6, g.dh.points)

        g.stay()
        assertEquals(44, g.deck.size)
        assertEquals(4, g.ph.size)
        assertEquals(4, g.dh.size)
        assertEquals(15, g.ph.points)
        assertEquals(21, g.dh.points)

    }


}

