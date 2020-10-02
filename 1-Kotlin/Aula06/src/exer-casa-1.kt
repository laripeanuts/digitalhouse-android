fun main() {
    var maior = Int.MIN_VALUE
    print("Informe valor um: ")
    val numero1 = readLine()!!.toInt()
    print("Informe valor dois: ")
    val numero2 = readLine()!!.toInt()
    print("Informe valor tres: ")
    val numero3 = readLine()!!.toInt()

    if (numero1 > maior) {
        maior = numero1
    }

    if (numero2 > maior) {
        maior = numero2
    }

    if (numero3 > maior) {
        maior = numero3
    }

    print("O número de maior valor é: $maior" )
}

