import kotlin.random.Random

fun main (){
    var anterior =0
    println("Rolar dados? (s ou n)")
    var resposta = readLine()!!.toLowerCase()
    if(resposta=="s"){
        var valor = rolarDados()
        anterior= resultadoFinal(valor)
        if(anterior == 0){
            var endOfGame = jogarSegundaVez(valor)
        }else{
            println("Obrigado por jogar")
        }
    }
}
fun rolarDados () = Random.nextInt(2,12)

fun jogarSegundaVez (numero: Int ) {
    entrada_tres()
    var valor = rolarDados()
    var anterior= numero
    compara(valor,anterior)
}

fun resultadoFinal (numero :Int) :Int{
    var continuar = -1
    if(numero == 7 || numero == 11){
        println("Você tirou $numero! Parabéns você ganhou! ")
        return numero
    }else if(numero == 2 || numero == 3 || numero == 12){
        println("Você tirou $numero! Você perdeu :(")
        return numero
    }else{
        println("Você tirou $numero! Aperte enter para tentar novamente")
        continuar = 0
        return continuar
    }
}
fun compara(valorAtual: Int, valorAnterior :Int) {
    if(valorAtual==valorAnterior){
        println("Você tirou $valorAtual de novo! Parabéns você ganhou")
    }else{
        println("Você tirou $valorAtual! Você perdeu :(")
    }
}
fun entrada_tres () = readLine()