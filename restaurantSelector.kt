fun main(args: Array<String>) {

    fun String.toBoolean() = equals("YES", ignoreCase = true)

    println("Is anyone in your party a vegetarian?")
    val vegetarian = readln()
    val answerVegetarian = vegetarian.toBoolean()

    println("Is anyone in your party a vegan?")
    val vegan = readln()
    val answerVegan = vegan.toBoolean()

    println("Is anyone in your party gluten-free?")
    val glutenFree = readln()
    val answerGlutenFree = glutenFree.toBoolean()

    if (answerVegetarian == true && answerVegan == true && answerGlutenFree == true) {
        println("Here are your choices: ")
        println("Corners Cafe")
        println("The Chef's Kitchen")
    }
    else if (answerVegetarian == false && answerVegan == false && answerGlutenFree == false) {
        println("Here are your choices: ")
        println("Joe's Gourmet Burgers")
    }
    else if (answerVegetarian == true && answerVegan == false && answerGlutenFree == true) {
        println("Here are your choices: ")
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
    else if (answerVegetarian == false && answerVegan == true && answerGlutenFree == true) {
        println("Here are your choices: ")
        println("Corner Cafe")
        println("The Chef's Kitchen")
        println("Main Street Pizza Company")
    }
    else if (answerVegetarian == true && answerVegan == true && answerGlutenFree == false) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("Mama's Fine Italian")
        println("The Chefs Kitchen")
    }
    else if (answerVegetarian == true && answerVegan == false && answerGlutenFree == false) {
        println("Here are your choices: ")
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("Mama's Fine Italian")
        println("The Chef's Kitchen")
    }
    else if (answerVegetarian == false && answerVegan == true && answerGlutenFree == false) {
        println("Here are your choices: ")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
    else if (answerVegetarian == false && answerVegan == false && answerGlutenFree == true) {
        println("Here are your choices: ")
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
}