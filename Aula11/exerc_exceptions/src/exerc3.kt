import kotlin.ArithmeticException

fun main() {
    var calc = CalculoMatematico()
    try {

        calc.divisao(16, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }
}