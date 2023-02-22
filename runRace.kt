fun main(args: Array<String>) {

    println("Enter the name and time, in minutes, of three runners.")

    println("First runner: ")
    val runOne = readln()
    println("Time: ")
    val timeOne = readln().toInt()

    println("Second runner: ")
    val runTwo = readln()
    println("Time: ")
    val timeTwo = readln().toInt()

    println("Third runner: ")
    val runThree = readln()
    println("Time: ")
    val timeThree = readln().toInt()

    if (timeOne >= timeTwo) {
        if (timeTwo >= timeThree)
            println("$runThree, $runTwo, $runOne");
        else if (timeThree >= timeOne)
            println("$runTwo, $runOne, $runThree")
        else if (timeOne >= timeThree)
            println("$runTwo, $runThree, $runOne")
    } else {
        if (timeThree >= timeTwo)
            println("$runOne, $runTwo, $runThree")
        else if (timeThree >= timeOne)
            println("$runOne, $runThree, $runTwo")
        else if (timeOne >= timeThree)
            println("$runThree, $runOne, $runTwo")
    }
}