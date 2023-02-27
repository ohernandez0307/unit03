fun main(args: Array<String>) {
    println("Please enter weight (lbs) and height (in)")
    println("Weight: ")
    val weight = readln()!!.toInt()

    println("Height: ")
    val height = readln()!!.toInt()

    val bodyMass = (weight.toDouble() * 703 / (height.toDouble() * height.toDouble()))

    val BMI = Math.round(bodyMass * 10.0) / 10.0
    println("$BMI")

    if (BMI < 18.5) {
        println("This is underweight")
    } else if (BMI == 18.5 || BMI <= 25.0) {
        println("This is optimal weight")
    } else if (BMI > 25.0) {
        println("This is overweight")
    }

}