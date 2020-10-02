package exercicios.collections.ex04

fun main() {

    val guardaVolumes = GuardaVolumes(mutableMapOf<Int, List<Peca>>(), 0)

    val pecaA = Pertence("Ford", "Focus")
    val pecaB = Pertence("Toyota", "Etios")

    val listaPecas = mutableListOf<Peca>(pecaA, pecaB)

    println(guardaVolumes.guardarPeca(listaPecas))

    guardaVolumes.mostrarPecas()

    guardaVolumes.devolverPeca(1)
    guardaVolumes.mostrarPecas()

}