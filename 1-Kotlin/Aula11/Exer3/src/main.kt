fun main() {
    val alunoA = Aluno("Larissa Rabelo", 12345)
    val alunoB = Aluno("Fernanda Rabelo", 23456)
    val alunoC = Aluno("Flavio Neto", 34567)
    val alunoD = Aluno("Terezinha Rabelo", 45678)

    val alunos = ArrayList<Aluno>()
    alunos.add(alunoA)
    alunos.add(alunoB)
    alunos.add(alunoC)
    alunos.add(alunoD)

    val alunoNovo = Aluno("Lari Rabelo", 12345)

    println("${alunoNovo.nome} já está matriculado?")
    if (alunos.contains(alunoNovo)) {
        println("Aluno já matriculado.")
    } else {
        println("Aluno não matriculado.")
    }

    // Na primeira tentativa o resultado foi false,
    // pois mesmo com mesmo valor Int, não eram "eguals".
    // Depois de sobrescrever a fun equals na classe Aluno,
    // os valores passaram a ser de fato iguais.
}