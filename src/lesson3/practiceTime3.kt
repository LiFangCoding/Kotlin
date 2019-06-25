package lesson3

import java.util.*

fun main(args: Array<String>) {
//    dayOfWeek()
    println("Hello, ${args[0]}!")
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false

}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sunday"
        3 -> "Monday"
        4 -> "Tuesday"
        5 -> "Wednesday"
        6 -> "Thursday"
        7 -> "Friday"
        else -> "Time has stopped"
    })
}
