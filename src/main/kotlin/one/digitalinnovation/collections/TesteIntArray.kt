package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 9
    values[2] = 7
    values[3] = 5
    values[4] = 3

    println("For Simples ===========")
    for (valor in values) {
        println(valor)
    }

    println("forEach ============")
    values.forEach { valor ->
        println(valor+1)
    }

    println("For com indices ============")
    for (index in values.indices){
        println(values[index])
    }

    println("For com sort ==============")
    values.sort()
    for (valor in values.indices){
        println(valor)
    }
}