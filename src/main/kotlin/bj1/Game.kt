package bj1

class Game(shuffle: Boolean) {

    val deck = Deck(shuffle)
    val ph = Hand("Player")
    val dh = Hand("Dealer")

    init {
        ph.add(deck.take())
        dh.add(deck.take())
        ph.add(deck.take())
        dh.add(deck.take())
    }

    fun hit() {
        ph.add(deck.take())
    }

    fun stay() {
        while (dh.points < 17) dh.add(deck.take())
    }

}