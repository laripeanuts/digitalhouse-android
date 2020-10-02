fun main(){
    val inteiros = arrayOfNulls<Double>(5)

    for(numero in 0..4){
        print("Insira uma atura: ")
        inteiros[numero] = readLine()!!.toDouble()
    }

    inteiros.reverse()

    inteiros.forEach { numero ->
        print("$numero ")
    }
}