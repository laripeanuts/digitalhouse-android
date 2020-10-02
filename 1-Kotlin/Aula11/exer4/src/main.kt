fun main() {
    val func1 = Funcionario("Larissa", 123)
    val func2 = Funcionario("Polly", 234)
    val func3 = Funcionario("Romeo", 456)
    val func4 = Funcionario("Ju", 567)

    val funcionarios = arrayListOf(
        func1,
        func2, func3, func4
    )

    val funcionarioNovo = Funcionario("Patricia", 123)

    println(funcionarios.contains(funcionarioNovo))
}