package bj1

class Card(val value: Int, val suit: Int) {

    val suitName: String get() = when (suit) {
        1 -> "Spades"
        2 -> "Hearts"
        3 -> "Clubs"
        4 -> "Diamonds"
        else -> throw IllegalStateException()
    }

    val valueName: String get() {
        return "Ace"
    }



}