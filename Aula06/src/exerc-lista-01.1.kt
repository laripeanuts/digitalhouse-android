fun main() {
    val inteiros = arrayOfNulls<Int>(5)

    for (numero in 0..4) {
        print("Insira um numero inteiro: ")
        inteiros[numero] = readLine()!!.toInt()
    }

    inteiros.forEach { numero ->
        print("$numero ")
    }

}