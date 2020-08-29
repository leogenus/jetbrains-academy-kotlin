import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val chars = scanner.nextLine()!!.split(" ".toRegex())
    val char1 = chars[0].toCharArray()[0]
    val char2 = chars[1].toCharArray()[0]
    println(char1.toUpperCase() == char2.toUpperCase())
}
