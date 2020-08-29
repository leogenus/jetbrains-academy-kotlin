import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val reverseNumber = StringBuilder(number.toString()).reverse().toString().toInt()
    println(reverseNumber)
}
