fun main(args: Array<String>) {
    println("Please enter weight (lbs) and height (in)")
    println("Weight: ")
    val weight = readln()!!.toInt()

    println("Height: ")
    val height = readln()!!.toInt()

    val bodyMass = (weight.toDouble() * 703 / height.toDouble() * height.toDouble())

    println("$bodyMass")
}

// not working
