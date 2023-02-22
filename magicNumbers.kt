fun main(args: Array<String>) {
    println("Please enter a month, day, and two-digit year in numeric form")
    println("Month: ")
    val month = readln()!!.toInt()
    println("Day: ")
    val day = readln()!!.toInt()
    println("Year: ")
    val year = readln()!!.toInt()

    if (month * day == year)
        println("The date is magic!")
    else {
        println("The date is not magic.")
    }
}