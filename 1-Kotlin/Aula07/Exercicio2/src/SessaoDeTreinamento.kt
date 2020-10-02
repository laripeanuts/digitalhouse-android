class SessaoDeTreinamento {

    fun treinamento(jogador: JogadorDeFutebol) {
        jogador.xp ++
    }

    fun treinar(jogador: JogadorDeFutebol) {
        println("${jogador.nome} XP inicial: ${jogador.xp}.")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        treinamento(jogador)
        println("${jogador.nome} XP Atual: ${jogador.xp}.")
    }

}