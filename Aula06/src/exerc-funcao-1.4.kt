fun main() {
    do {
        println("Rolar dados? (s ou n)")
        val jogar = readLine()!!.toLowerCase()

        if (jogar == "s") {
            when (val valorDado = valorDoDado()) {
                7, 11 -> {
                    mensagemDeGanhou(valorDado)
                }
                2, 3, 12 -> {
                    mensagemDePerdeu(valorDado)
                }
                4, 5, 6, 8, 9, 10 -> {
                    jogarNovamente(valorDado, valorDado)
                }
            }
        } else {
            println("O jogo acabou")
            break
        }
    } while (true)
}

fun jogarNovamente(valorTirado: Int, valorAuxiliar: Int) {
    print("Você tirou $valorAuxiliar! Aperte enter para tentar novamente")
    readLine()
    when (val valorDado = valorDoDado()) {
        7 -> {
            mensagemDePerdeu(valorDado)
        }
        valorTirado -> {
            mensagemDeGanhou(valorDado)
        }
        else -> jogarNovamente(valorTirado, valorDado)
    }

}

private fun valorDoDado(): Int {
    return Random.nextInt(2, 12)
}

private fun mensagemDeGanhou(valorDado: Int) {
    println("Você tirou $valorDado! Parabéns você ganhou!")
    println()
}

private fun mensagemDePerdeu(valorDado: Int) {
    println("Você tirou $valorDado! Você perdeu =(")
    println()
}

