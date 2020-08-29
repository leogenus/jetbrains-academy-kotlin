import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val groupA = scanner.nextInt()
    val groupB = scanner.nextInt()
    val groupC = scanner.nextInt()
    val totalDesks = groupA / 2 + groupA % 2 + groupB / 2 + groupB % 2 + groupC / 2 + groupC % 2
    println(totalDesks)
}
