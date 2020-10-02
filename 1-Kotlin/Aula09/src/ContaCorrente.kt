class ContaCorrente(
        val taxaDeOperacao: Double,
        saldo: Double,
        conta: Int
) : ContaBancaria(conta, saldo), Imprimivel {
    override fun sacar(valorSaque: Double): Boolean {
        val saldoMaisTaxa = valorSaque + taxaDeOperacao
        if(saldo >= saldoMaisTaxa) {
            saldo -= saldoMaisTaxa
            println("Saque realizado!")
            return true
        } else {
            println("Saldo Insuficiente!")
            return false
        }
    }

    override fun depositar(valorDeposito: Double): Boolean {
        val saldoMaisDeposito = saldo + valorDeposito
        if(saldoMaisDeposito >= taxaDeOperacao) {
            saldo += (valorDeposito - taxaDeOperacao)
            println("Deposito realizado com sucesso! Seu novo saldo é $saldo.")
            return true
        } else {
            println("Saldo insuficiente!")
            return false
        }

    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("A taxa de operação é de $taxaDeOperacao reais.")
    }
}