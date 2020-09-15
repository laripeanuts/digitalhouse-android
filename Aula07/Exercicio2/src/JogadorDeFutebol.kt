class JogadorDeFutebol(var nome: String, var energia: Int,
                       var alegria: Int, var gols: Int, var xp: Int) {

    fun fazerGol() {
        energia += 5
        alegria += 10
        gols ++
        println("GOOOOOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei!")
    }

    override fun toString(): String {
        return "Nome: ${this.nome}. \n" +
                "Energia: ${this.energia}. \n" +
                "Alegria: ${this.alegria}. \n" +
                "Gols: ${this.gols}. \n" +
                "XP: ${this.xp}. \n"
    }
}