fun main() {
    var cliente = Cliente()
    cliente.nome = "Larissa"
    cliente.sobrenome = "Rabelo"
    var conta = Conta()
    conta.numeroConta = 12345
    conta.saldo = 1000.0
    conta.titular = cliente

    print("Qual valor você quer depositar? ")
    var valorDepositado = readLine()!!.toDouble()
    conta.deposito(valorDepositado)

    print("Qual valor você quer sacar? ")
    var valorSaque = readLine()!!.toDouble()
    conta.saque(valorSaque)
}