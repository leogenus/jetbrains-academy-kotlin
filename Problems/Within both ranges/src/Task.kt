import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val x3 = scanner.nextInt()
    val x4 = scanner.nextInt()
    val x5 = scanner.nextInt()
    println(x5 in x1..x2 && x5 in x3..x4)
}
