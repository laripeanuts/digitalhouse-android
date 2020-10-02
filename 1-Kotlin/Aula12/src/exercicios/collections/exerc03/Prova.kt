class Prova {
    fun somaTotal(conjuntoInt: MutableSet<Int>): Int {
        var total: Int = 0

        conjuntoInt.forEach { total+=it }

        return total
    }
}