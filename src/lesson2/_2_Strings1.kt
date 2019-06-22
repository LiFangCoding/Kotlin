package lesson2

fun main() {
    val trout = "trout12"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")

    when(trout.length) {
        0 -> println("error message")
        in 3..12 -> println("good fish name")
        else -> println("good fish name")
    }

    practice()
}

fun practice() {
    val numbers = 11..15
    val list3 = mutableListOf<String>()
    for (num in numbers) {
        list3.add(num.toString())
    }
    println(list3)
}
