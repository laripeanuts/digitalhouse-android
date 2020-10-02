fun main() {
    val relatorio = Relatorio()
    val contaC = ContaCorrente(10.0,
            100.0,
            12345)
    val contaP = ContaPoupanca(50.0,
            54321,
            100.0)

    contaC.depositar(100.0)
    contaC.sacar(300.0)

    contaP.depositar(10.0)
    contaP.sacar(100.0)

    println()

//    relatorio.gerarRelatorio(contaC)
//    relatorio.gerarRelatorio(contaP)

    val bancoA = Banco()
    bancoA.inserir(contaC)
    bancoA.inserir(contaP)
    bancoA.mostrarDados()
}