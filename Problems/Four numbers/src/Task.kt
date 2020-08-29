import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val list = scanner.nextLine()!!.replace("\\s+".toRegex(), " ").split(" ")
    for (number in list)
        println(number)
}
