fun main(){
    print("Escreva um número: ")
    val numero = readLine()!!.toInt()

    if (par(numero)) {
        println("É par")
    }else {
        println("É ímpar")
    }
}

fun par(numero: Int): Boolean {
    return numero % 2 == 0
}
