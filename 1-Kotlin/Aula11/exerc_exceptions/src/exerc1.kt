fun main() {
    var meuArray = arrayListOf<String>()
    meuArray.add("Pato")
    meuArray.add("Cachorro")
    meuArray.add("Gato")
    try {
        println(meuArray[3])
    } catch (ex: Exception) {
        println("Erro")
    }
}