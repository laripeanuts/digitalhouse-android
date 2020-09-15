const val MENSAGEM = "Digite um número: "

fun main(){
    val a= entrada()
    val b= entrada()
    val c= entrada()

    println(soma(a,b,c))

}

fun soma (a :Int,b :Int, c :Int) :Int{
    return a+b+c
}
fun entrada ():Int {
    println(MENSAGEM)
    return readLine()!!.toInt()
}