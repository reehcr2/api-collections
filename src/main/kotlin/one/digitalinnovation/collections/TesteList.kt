package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",1000.0)
    val maria = Funcionario("maria",2000.0)
    val jose = Funcionario("jose",800.0)

    val funcionarios = listOf(joao, maria, jose)

    funcionarios.forEach{
        println(it)
    }

    println("===========================")
    println(funcionarios.find {
        it.nome == "maria"
    })


}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()

}