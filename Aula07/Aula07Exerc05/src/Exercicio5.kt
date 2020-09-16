fun main() {

    val clienteA = Cliente(
        "Larissa", "Rabelo",
        "8534940000"
    )
    val carroA = Carro(
        "Ford", "Fiesta", 2019,
        "Preto", 20000
    )

    val vendaA = Venda(10000.0, carroA, clienteA)
    val concessionariaA = Concessionaria("Benfica")

    concessionariaA.registrarVenda(carroA, clienteA, vendaA.valorVenda)
}