fun main() {
    var meuArray = arrayListOf<String?>(null)
    meuArray.add("Pato")
    meuArray.add("Cachorro")
    meuArray.add("Gato")
    try {
        println(meuArray[2])
        println(meuArray[5])
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}