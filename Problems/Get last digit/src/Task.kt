import java.util.*

fun getLastDigit(number: Int): Char {
    val numberText = number.toString()
    return numberText[numberText.length - 1]
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}
