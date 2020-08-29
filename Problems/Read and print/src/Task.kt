import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Any>()
    for (i in 1..2)
        list.add(scanner.nextLine())
    for (i in 1..2)
        list.add(scanner.nextInt())
    for (any in list)
        println(any)
}
