import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()!!
    val character = word[0]
    print(character in 'A'..'Z' || character in '1'..'9')
}
