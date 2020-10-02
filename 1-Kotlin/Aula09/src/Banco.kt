class Banco: Imprimivel {
    val contas = ArrayList<ContaBancaria>()

    fun inserir(conta: ContaBancaria) {
        contas.add(conta)
    }

    fun remover(conta: ContaBancaria) {
        contas.remove(conta)
    }

    fun procurarConta(numeroDaConta: Int): ContaBancaria? {
        for (conta in contas) {
            if (conta.numeroDaConta == numeroDaConta) {
                return conta
            }
        }
        return null
    }

    override fun mostrarDados() {
        contas.forEach {
            it.mostrarDados()
            println()
        }
    }
}