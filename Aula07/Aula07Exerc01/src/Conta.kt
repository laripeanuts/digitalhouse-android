class Conta {
    var numeroConta: Int = 0
    var saldo: Double = 0.0
    var titular: Cliente = Cliente()

    fun deposito(quantiaDeDinheiro: Double) {
        saldo = saldo + quantiaDeDinheiro
        println("Depósito realizado. Novo saldo é de R$ $saldo.")
    }

    fun saque(quantiaDeSaque: Double) {
        if (quantiaDeSaque <= saldo) {
            saldo = saldo - quantiaDeSaque
            print("Transação realizado. Seu nome saldo é de R$ $saldo")
        } else {
            println("Saldo insuficiente.")
        }

    }
}