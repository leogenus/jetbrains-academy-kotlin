import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val diff1 = abs(x1 - x2)
    val diff2 = abs(y1 - y2)
    println(if (diff1 == diff2 || diff1 == 0 || diff2 == 0) "YES" else "NO")
}
