import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val min = scanner.nextLong()
    val max = scanner.nextLong()
    var product = min
    for (i in min + 1 until max) {
        product *= i
    }
    println(product)
}
