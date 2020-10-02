package pessoas_estados

fun main() {
    val estadoA = Estado("AC", "Acre")
    val estado2 = Estado("RN", "Rio Grande do Norte")
    val estado3 = Estado("GO", "Goiás")
    val estado4 = Estado("SP", "São Paulo")
    val estado5 = Estado("PR", "Paraná")

    val pessoas = listOf(
        Pessoa("Pessoa 1", estado1),
        Pessoa("Pessoa 2", estado2),
        Pessoa("Pessoa 3", estado5),
        Pessoa("Pessoa 4", estado4),
        Pessoa("Pessoa 5", estado3),

    )

    println(pessoas.groupBy { it.estado.sigla })
}