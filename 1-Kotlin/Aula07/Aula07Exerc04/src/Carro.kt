class Carro(var nome: String, val consumo: Int) {
    var nivelCombustivel: Int = 0

    fun andar(distancia: Int) {
        if(nivelCombustivel >= distancia/consumo) {
        nivelCombustivel -= distancia/consumo
        println("Você andou $distancia quilometros.")
        } else {
            println("Acabou a gasolina, sinto muito.")
        }
    }

    fun obterGasolina() {
        println("Nível de gasolina agora é ${this.nivelCombustivel}.")
    }
    fun adicionarGasolina(quantidadeCombustivel: Int) {
        nivelCombustivel += quantidadeCombustivel
        println("Foi abastecido $quantidadeCombustivel litros")
    }
}