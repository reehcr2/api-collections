package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",1000.0,"CLT")
    val maria = Funcionario("maria",2000.0,"CLT")
    val jose = Funcionario("jose",800.0,"PJ")

    val funcionarios1 = setOf(joao, jose)
    val funcionarios2 = setOf(maria)

    println("================Unindo os conjuntos")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{
        println(it)
    }

    println("================Subtraindo um conjunto")
    val funcionarios3 = setOf(joao, maria, jose)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{
        println(it)
    }

    println("================Mostrando o que tem de comum nos conjuntos")
    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach{
        println(it)
    }
}