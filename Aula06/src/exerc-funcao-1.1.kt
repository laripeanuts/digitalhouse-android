fun main() {

    print("Informe valor um: ")
    val numero1 = readLine()!!.toInt()
    print("Informe valor dois: ")
    val numero2 = readLine()!!.toInt()
    print("Informe valor tres: ")
    val numero3 = readLine()!!.toInt()

    print("Total: " + soma(numero1, numero2, numero3))
}

fun soma(numero1: Int, numero2: Int, numero3: Int) = numero1 + numero2 + numero3