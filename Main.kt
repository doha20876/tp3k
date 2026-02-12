fun main() {

    println("Task 1:")
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    println()

    println("Task 2:")
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = 11 - i * 2
        for (j in 1..numberOfStars) print("*")

        println()
    }

    println()

    println("Task 3:")
    val height = 5

    for (i in 1..height) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    for (i in (height - 1) downTo 1) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }
}
