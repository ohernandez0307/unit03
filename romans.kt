fun main(args: Array<String>) {
    println("Please enter a number between 1 and 10:  ")
    val userNumber = readln()!!.toInt()

    when (userNumber) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("error")
    }
}