fun main(){
    println("Digite a taxa do imposto em porcentagem: ")
    val taxa = entrada_dois()
    println("Digite o custo do produto: ")
    val custo = entrada_dois()

    println(SomaImposto(taxa,custo))
}
fun SomaImposto(taxaImposto :Double, custo :Double) :Double{

    var taxaImposto = taxaImposto/100
    var custo = custo + (custo*taxaImposto)
    return custo
}
fun entrada_dois () = readLine()!!.toDouble()
