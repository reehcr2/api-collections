package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",1000.0,"CLT")
    val maria = Funcionario("maria",2000.0,"CLT")
    val jose = Funcionario("jose",800.0,"PJ")

    val funcionarios = listOf(joao, maria, jose)

    funcionarios.forEach{
        println(it)
    }

    println("===========================")
    println(funcionarios.find {
        it.nome == "maria"
    })

    println("===========================")
    funcionarios
        .sortedBy { it.salario }
        .forEach{
            println(it)
        }

    println("===========================")
    funcionarios
        .groupBy{ it.tipoContratacao }
        .forEach{
            println(it)
        }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()

}