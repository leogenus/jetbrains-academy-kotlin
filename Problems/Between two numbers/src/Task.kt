import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val x3 = scanner.nextInt()
    println(x1 in x2..x3)
}
