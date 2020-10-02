abstract class Peca(val marca: String, val modelo: String) {
    abstract fun retirada()

    override fun toString(): String {
        return "Peça (marca='$marca', modelo='$modelo')"
    }


}