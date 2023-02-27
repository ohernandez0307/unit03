fun main(args: Array<String>) {
    println("Please enter three names")

    println("Name 1: ")
    val nameOne = readln()!!

    println("Name 2: ")
    val nameTwo = readln()!!

    println("Name 3: ")
    val nameThree = readln()!!

    val list = mutableListOf("$nameOne", "$nameTwo", "$nameThree")

    list.sort()
    println(list)
}