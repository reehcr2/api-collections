package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "1000".toBigDecimal(),
        "7000".toBigDecimal(),
        "21000".toBigDecimal(),
    )

    println("==================== Usando Função extendida Somatoria")
    println(salarios.somatoria())
    println("==================== Usando Função extendida Media")
    println(salarios.media())
}