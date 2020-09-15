fun main(){
    val alturas = arrayOfNulls<Double>(5)

    for(i in 0..4){
        println("Insira um número inteiro: ")
        alturas[i]= readLine()!!.toDouble()
    }
    alturas.reverse()
    println(alturas)
}