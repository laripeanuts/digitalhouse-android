class Carro(
    val marca: String, val modelo: String,
    val anoFabricacao: Int, val cor: String,
    val quilometragem: Int
) {
    val dadosCarro = marca + " " + modelo + " " + anoFabricacao
}