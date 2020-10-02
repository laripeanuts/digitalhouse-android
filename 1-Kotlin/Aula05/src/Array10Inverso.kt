fun main(){
    val inteiros = arrayOfNulls<Int>(10)

    for(i in 0..9){
        println("Insira um número inteiro: ")
        inteiros[i]= readLine()!!.toInt()
    }
    inteiros.reverse()

    inteiros.forEach{ elementos ->
        println(elementos)
    }
}