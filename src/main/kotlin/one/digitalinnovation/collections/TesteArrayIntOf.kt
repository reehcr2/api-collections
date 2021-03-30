package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2,3,4,1,10,7)

    println("intArrayOf com forEach")
    values.forEach {
        println(it)
    }

    println("intArrayOf ordenando os valores com sort")
    values.sort()
    values.forEach {
        println(it)
    }
}