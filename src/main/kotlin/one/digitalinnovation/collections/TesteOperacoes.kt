package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1200.0, 800.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("====================")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("====================")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    salariosMaiorque2500.forEach{
        println(it)
    }

    println("====================")
    println(salarios.count{
        it in 2000.0..5000.0
    })

    println("====================")
    println(salarios.find { it == 800.0 })

    println("====================")
    println(salarios.find { it == 80.0 })

    println("====================")
    println(salarios.any { it == 1200.0 })

    println("====================")
    println(salarios.any { it == 100.0 })
}