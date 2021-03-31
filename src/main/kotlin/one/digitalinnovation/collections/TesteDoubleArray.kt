package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 10000.0
    salarios[1] = 2000.0
    salarios[2] = 12000.0

    salarios.forEach {
        println(it)
    }

    println("===================")
    salarios.forEachIndexed{
        index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach {
        println(it)
    }

    println("===================")
    val salarios2 = doubleArrayOf(1500.0, 2500.0, 100.0)
    salarios2.sort()

    salarios2.forEach {
        println(it)
    }
}