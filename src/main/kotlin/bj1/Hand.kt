package bj1

class Hand(val name: String) {

    private val _cards: MutableList<Card> = mutableListOf<Card>()

    val cards: List<Card> get() = _cards

    fun add(card: Card) {
        _cards.add(card)
    }

    val size get() = _cards.size

    val points1: Int get() {
        var t = 0
        for (c in _cards) t += c.points
        return t
    }

    val points2: Int get() {
        var t = 0
        _cards.forEach { t += it.points }
        return t
    }

    val points get() = _cards.sumBy { it.points }


}