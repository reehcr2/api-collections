package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("joao",1000.0,"CLT")
    val maria = Funcionario("maria",2000.0,"CLT")
    val jose = Funcionario("jose",800.0,"PJ")

    println("================ Criando Mutable List")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
    }

    println("================ Add Elemento")
    funcionarios.add(jose)
    funcionarios.forEach {
        println(it)
    }

    println("================ Remove Elemento")
    funcionarios.remove(maria)
    funcionarios.forEach {
        println(it)
    }

    println("================ Remove Elemento no indice")
    funcionarios.removeAt(0)
    funcionarios.forEach {
        println(it)
    }

    println("================ Criando Set List")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach {
        println(it)
    }

    println("================== Add Itens")
    funcionarioSet.add(jose)
    funcionarioSet.add(maria)
    funcionarioSet.forEach {
        println(it)
    }

    println("================== Remove Itens")
    funcionarioSet.remove(jose)
    funcionarioSet.forEach {
        println(it)
    }
}