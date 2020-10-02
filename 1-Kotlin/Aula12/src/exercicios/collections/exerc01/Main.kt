fun main() {
    val loteriaSonhos =
        mapOf<Int, String>(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")

    val nomesApelidos =
        mapOf<String, List<String>>(
            "Larissa" to listOf<String>("Lala", "Lari", "Larissinha"),
            "Polly" to listOf("Popoca", "Buchinho", "Pithu")
        )

    loteriaSonhos.forEach{
        println(it.key)
        println(it.value)
    }

    println("-----")

    nomesApelidos.forEach{
        println(it.key)
        println(it.value)
    }
}