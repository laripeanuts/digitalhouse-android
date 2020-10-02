fun main() {
    val atletaA = Atleta("Polly", 50, 100)
    val atletaB = Atleta("Doce", 30, 50)

    val provaX = Prova(0,10)
    val provaY = Prova(50,30)
    val provaZ = Prova(80,50)

    provaX.realizarProva(atletaA)
    provaY.realizarProva(atletaA)
    provaZ.realizarProva(atletaA)
    provaX.realizarProva(atletaB)
    provaY.realizarProva(atletaB)
    provaZ.realizarProva(atletaB)

}