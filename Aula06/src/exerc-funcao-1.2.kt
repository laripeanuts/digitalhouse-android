fun main(){
    print("Digite um valor: ")
    val numero = readLine()!!.toInt()
    positivoOuNegativo(numero)
}

fun positivoOuNegativo(numero: Int) {
    if (positivo(numero)) {
        println("P")
    } else {
        println("N")
    }
}

fun positivo(numero: Int): Boolean {
    return numero > 0
}
