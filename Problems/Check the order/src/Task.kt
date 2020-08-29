import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var diff = 0
    var invalid = false
    repeat(n) {
        val number = scanner.nextInt()
        if (!invalid) {
            if (number - diff < 0) {
                invalid = true
            }
            diff = number
        }
    }

    println(if (invalid) "NO" else "YES")
}
