package bj1

import java.util.*

private val rng: Random = Random()

class Deck(shuffle: Boolean = true) {

    private val _cards = mutableListOf<Card>()

    init {
        for (s in 1..4) {
            for (v in 1..13) {
                _cards.add(Card(v, s))
            }
        }
        if (shuffle) repeat(10000, {
            val i1 = rng.nextInt(52)
            val i2 = rng.nextInt(52)
            val c1 = _cards[i1]
            val c2 = _cards[i2]
            _cards[i1] = c2
            _cards[i2] = c1
        })
    }

    val size: Int get() = _cards.size

    fun take(): Card = _cards.removeAt(0)

    val cards: List<Card> get() = _cards

}