fun main(args: Array<String>) {

//      $.10 each for less than 20 checks
//      $.08 each for 20–39 checks
//      $.06 each for 40–59 checks
//      $.04 each for 60 or more checks
//      base fee of $10 per month

    println("Please enter the number of checks written per month: ")
    val checks = readln().toInt()

    val bankFee = 10.00
    val lessThan20 = .10
    val between20and39 = 0.08
    val between40and59 = 0.06
    val greaterThan60 = 0.04
    var totalFee = 0.0

    if (checks < 20) {
        totalFee = (checks * lessThan20) + bankFee
        println("The total months fee is: $$totalFee")

    } else if (checks == 20 || checks <= 39) {
        totalFee = (checks * between20and39) + bankFee
        println("The total months fee is: $$totalFee")

    } else if (checks == 40 || checks <= 60) {
        totalFee = (checks * between40and59) + bankFee
        println("The total months fee is: $$totalFee")

    } else if (checks > 60) {
        totalFee = (checks * greaterThan60) + bankFee
        println("The total months fee is: $$totalFee")
    }

}