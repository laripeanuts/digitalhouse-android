import kotlin.math.max

fun main () {
    var voto = Int.MIN_VALUE
    val resultados = arrayOf(0, 0, 0, 0, 0, 0)
    val nomes = arrayOf("Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro")
    var total = 0.0
    var porc = 0
    var maior = arrayOf(0,0,0)
    var tam = 0
    val espaço = " "

    do {
        println("Qual o melhor Sistema Operacional para uso em servidores? ")
        println("As possíveis respostas são:")
        println("1-Windows Server \n2-Unix \n3-Linux \n4-Netware \n5-Mac OS \n6-Outro")
        voto = readLine()!!.toInt()
        if (voto != 0 && voto <= 6) {
            resultados[voto - 1]++
            total++
        } else if (voto == 0) {
            break
        } else {
            println("Opção inválida.")
        }
    } while (true)

    println("Sistema Operacional" + espaço.repeat(5) + "Votos " + espaço.repeat(3) + "%")
    println("-------------------" + espaço.repeat(5) + "-----" + espaço.repeat(3) + "---")
    for (i in 0..5) {
        tam = nomes[i].length
        porc = ((resultados[i] / total) * 100).toInt()
        println(nomes[i] + espaço.repeat(25 - tam) + resultados[i] + espaço.repeat(7) + porc)

        if(maior[0]<resultados[i]){
            maior[0]= resultados[i]
            maior[1]= i
            maior[2]= porc
        }
    }
    println("-----------------------------------")
    println("Total"+ espaço.repeat(18)+" $total")
    println("\n O Sistema Operacional mais votado foi o "+nomes[maior[1]]+", com "+resultados[maior[1]] + " votos,correspondendo a "+maior[2] +"% dos votos.")
}
