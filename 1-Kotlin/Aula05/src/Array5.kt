fun main (){
    val inteiros = arrayOfNulls<Int>(5)

    for(i in 0..4){
        println("Insira um número inteiro: ")
        inteiros[i]= readLine()!!.toInt()
    }
    inteiros.forEach { elemento ->
        println("$elemento,")
    }
}