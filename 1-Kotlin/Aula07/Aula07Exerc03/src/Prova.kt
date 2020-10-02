class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun realizarProva(atleta: Atleta): Boolean {
        if(atleta.nivel >= this.dificuldade && this.energiaNecessaria <= atleta.energia) {
            println("${atleta.nome}, pode realizar prova")
            atleta.energia -= this.energiaNecessaria
            return true
        } else {
            println("${atleta.nome}, não pode realizar prova")
            return false
        }
    }
}