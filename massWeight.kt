fun main(args: Array<String>) {
    println("Please enter the objects mass: ")
    val mass = readln()!!.toInt()

    val weight = mass * 9.8

    if (weight >= 1000) println("The object is too heavy!")
    else {
        (weight <= 10)
        println("The object is too light.")
    }
}
