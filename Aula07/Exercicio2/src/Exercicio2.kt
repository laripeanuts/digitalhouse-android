fun main() {
    val jogador1 = JogadorDeFutebol("Messi",100,
        50, 0, 0)
    val jogador2 = JogadorDeFutebol(
        "Ronaldo",100,
        50, 0, 0)

    val treinamento = SessaoDeTreinamento()
    treinamento.treinar(jogador1)
    println(jogador1.toString())
    treinamento.treinar(jogador2)
    println(jogador2.toString())

}