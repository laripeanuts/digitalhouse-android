fun main() {
    var clientePolly = Cliente()
    var contaPolly = Conta()
    clientePolly.nome = "Polly"
    clientePolly.sobrenome = "Rabelo"
    contaPolly.saldo = 10.0
    contaPolly.numeroConta = 1
    contaPolly.titular = clientePolly

    var clienteFlavio = Cliente()
    var contaFlavio = Conta()
    clienteFlavio.nome = "Flavio"
    clienteFlavio.sobrenome = "Neto"
    contaFlavio.saldo = 500.0
    contaFlavio.numeroConta = 2
    contaFlavio.titular = clienteFlavio

    print(clientePolly.nome + ", qual valor você quer depositar? ")
    var valorDepositadoPolly = readLine()!!.toDouble()
    contaPolly.deposito(valorDepositadoPolly)

    print(clientePolly.nome + ", valor você quer sacar? ")
    var valorSaquePolly = readLine()!!.toDouble()
    contaPolly.saque(valorSaquePolly)

    print(clienteFlavio.nome + ", qual valor você quer depositar? ")
    var valorDepositadoFlavio = readLine()!!.toDouble()
    contaFlavio.deposito(valorDepositadoFlavio)

    print(clienteFlavio.nome + ", qalor você quer sacar? ")
    var valorSaqueFlavio = readLine()!!.toDouble()
    contaFlavio.saque(valorSaqueFlavio)

}
