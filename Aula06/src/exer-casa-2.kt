fun main(){
    print("Me diga algo: ")
    val info1 = readLine()!!

    print("Me diga outra coisa: ")
    val info2 = readLine()!!

    if (textosSaoIguais(texto1, texto2)){
        println("São textos iguais")
    } else {
        println("São textos diferentes")
    }
}

fun textosSaoIguais(info1: String, info2: String): Boolean {
    return info1 == info2
}
