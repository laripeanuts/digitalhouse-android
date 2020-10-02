fun main(){
    print("Informe uma taxa: ")
    val taxaImposto = readLine()!!.toInt()
    print("Informe um custo: ")
    val custo = readLine()!!.toInt()
    somaImposto(taxaImposto, custo)
}

fun somaImposto(taxaImposto: Int, custo: Int) {
    val total = (custo * taxaImposto ) / 100 + custo
    println("Custo total $total")
}
