class ContaPoupanca(val limite: Double,
                    conta: Int,
                    saldo: Double)
    : ContaBancaria(conta, saldo) {
    override fun sacar(valorSaque: Double): Boolean {
        val saldoMaisLimite = saldo + limite
        if(saldoMaisLimite >= valorSaque){
            saldo -= valorSaque
            println("Saque realizado com sucesso!")
            return true
        } else {
            return false
        }
    }

    override fun depositar(valorDeposito: Double): Boolean {
        saldo += valorDeposito
        println("Depósito realizado com sucesso!")
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Seu limite é $limite reais.")
    }

}