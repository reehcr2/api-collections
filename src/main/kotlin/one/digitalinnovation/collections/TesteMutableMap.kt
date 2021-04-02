package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",1000.0,"CLT")
    val maria = Funcionario("maria",2000.0,"CLT")
    val jose = Funcionario("jose",800.0,"PJ")

    val repositorio = Repositorio<Funcionario>()

    println("============== Criar repositorio")
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(jose.nome, jose)

    println("============== Buscar pelo ID")
    println(
        repositorio.findById(maria.nome),
    )

    println("============== Buscar todos os itens do Repositorio")
    println("============== Objeto todo")
    println(
        repositorio.findAll()
    )
    println("============== Usando forEach")
    repositorio.findAll().forEach{
        println(it)
    }

    println("================= Removendo um indice")
    repositorio.remove(jose.nome)
    repositorio.findAll().forEach{
        println(it)
    }
}