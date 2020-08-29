import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<String>()
    for (i in 1..5)
        list.add(scanner.next())
    for (word in list)
        println(word)
}
