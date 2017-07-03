package bj1

class Deck {

    private val _cards = mutableListOf<Card>()

    init {
        for (s in 1..4) {
            for (v in 1..13) {
                _cards.add(Card(v, s))
            }
        }
    }

    val size: Int get() = _cards.size

    fun take(): Card = _cards.removeAt(0)

    val cards: List<Card> get() = _cards

}