fun main() {
    val array = arrayOf("leao", "sapo", "jacaré")


    array.forEach { elemento -> println(elemento) }

    println()

    for (elemento in array) {
        println(elemento)
    }
}