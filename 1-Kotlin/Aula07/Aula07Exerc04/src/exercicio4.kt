fun main() {
    val meuCarro = Carro("Cadilac", 1)

    println("${meuCarro.nome} faz ${meuCarro.consumo} litros por quilometro e possui ${meuCarro.nivelCombustivel} litros no momento.")
    print("Abastaça o ${meuCarro.nome}: ")
    var quantidadeAbastecer = readLine()!!.toInt()
    meuCarro.adicionarGasolina(quantidadeAbastecer)
    print("Ande com o ${meuCarro.nome}: ")
    var quantidadeAndar = readLine()!!.toInt()
    meuCarro.andar(quantidadeAndar)
    meuCarro.obterGasolina()

}