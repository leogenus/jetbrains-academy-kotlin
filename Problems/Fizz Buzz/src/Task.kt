import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    for (i in start..end) {
        println(if (i % 3 == 0 && i % 5 == 0) {
            "FizzBuzz"
        } else if (i % 3 == 0) {
            "Fizz"
        } else if (i % 5 == 0) {
            "Buzz"
        } else i)
    }
}
