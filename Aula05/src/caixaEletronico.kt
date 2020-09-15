fun main(){
    val notas = arrayOf(100,50,10,5,1)
    println("Digite a quantidade a ser sacada: ")
    var valor = readLine()!!.toInt()
    var cedulas = 0

    for(i in 0..4){
        cedulas = valor/notas[i]
        if(cedulas>=1){
            println("$cedulas de "+notas[i]+" reais.")
        }
        valor -=(cedulas*notas[i])
    }
}