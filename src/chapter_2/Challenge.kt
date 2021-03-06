package chapter_2

import java.util.*

/**
 * Challenge
 *
 * Generate a random number between 0 and 49 using the following code:
 * val random = Random().nextInt(50)
 *
 * IntelliJ helps you import the Random class from Java so that you can use it. Don’t worry about the details of imports for now.
 *
 * Now, use a when statement to switch between the cases where random is in
 * the range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40. In each case, print out
 * a message containing the range and the exact value of random.
 *
 * Test your code in a main() function and run it several times to get different random numbers.
 **/

fun main(args: Array<String>) {
    val random = Random().nextInt(50)

    when(random) {
        in 1..10 -> println("1..10 - value is $random")
        in 11..20 -> println("11..20 - value is $random")
        in 21..30 -> println("21..30 - value is $random")
        in 31..40 -> println("31..40 - value is $random")
        else -> println("above 40 - value is $random")
    }
}