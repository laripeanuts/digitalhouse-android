class Concessionaria(val nome: String) {
    fun registrarVenda(
        carro: Carro, cliente: Cliente,
        valorVenda: Double
    ) {
        var venda = Venda(valorVenda, carro, cliente)
        println("Registro feito com sucesso!")
        println("${cliente.nomeCompleto}, comprou ${carro.dadosCarro} por R$ ${venda.valorVenda}.")
    }
}