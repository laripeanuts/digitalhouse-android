fun main() {
    val quantidadeCedulas = arrayOf(0, 0, 0, 0, 0)
    val cedulas = arrayOf(1, 5, 10, 50, 100)

    print("Qual o valor do saque? ")
    var valorSaque = readLine()!!.toInt()

    if (valorSaque in 10..600) {
        for (numero in 4 downTo 0) {
            quantidadeCedulas[numero] = valorSaque / cedulas[numero]
            valorSaque %= cedulas[numero]
            println("" + quantidadeCedulas[numero] + " nota(s) de " + cedulas[numero])
        }
    } else {
        println("Valor não permitido")
    }

}