package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Jose"
    nomes[2] = "Joao"

    println("Apresentando o Array de Strings")
    for (nome in nomes){
        println(nome)
    }

    println("Apresentando o Array usando o sort")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("Apresentando o Array usando o sort e arrayOf")
    val nomes2 = arrayOf("Maria", "Antonio","Zeca")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}