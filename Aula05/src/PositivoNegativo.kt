fun main(){
    print("Digite um valor: ")
    val valor= readLine()!!.toInt()

    println(validacao(valor))
}
fun validacao (valor :Int) :Char{
    if(valor>0){
        return 'P'
    }else{
        return 'N'
    }
}