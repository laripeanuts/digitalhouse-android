abstract class ContaBancaria(
        val numeroDaConta: Int,
        var saldo: Double
): Imprimivel {
    abstract fun sacar(valorSaque: Double): Boolean
    abstract fun depositar(valorDeposito: Double): Boolean

    fun transferir(valorTransferencia: Double, contaDestino: ContaBancaria){
        if(sacar(valorTransferencia) && contaDestino.depositar(valorTransferencia)){
              println("Transferência realizada!")
        }
    }

    override fun mostrarDados() {
        println("A conta $numeroDaConta possui $saldo reais.")
    }
}