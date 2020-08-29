import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val chars = scanner.nextLine()!!.split(" ".toRegex())
    val char1 = chars[0].toCharArray()[0]
    val char2 = chars[1].toCharArray()[0]
    val char3 = chars[2].toCharArray()[0]
    val diff1 = char2 - char1
    val diff2 = char3 - char2
    println(diff1 == 1 && diff2 == 1)
}
