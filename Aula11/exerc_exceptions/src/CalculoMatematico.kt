import java.lang.ArithmeticException

class CalcMatematico() {
    fun div(a: Int, b: Int): Int {
        if (b == 0) throw ArithmeticException("Divisão por zero")
        return a / b
    }
}