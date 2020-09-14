package exercicioComObjetos3

fun main(){
    val atleta1 = Atleta("Maria",2,80)
    val atleta2 = Atleta("João",5, 70)

    val prova1 = Prova(1,10)
    val prova2 = Prova(3,50)
    val prova3 = Prova(5,90)

    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta1))

    println(prova1.podeRealizar(atleta2))
    println(prova2.podeRealizar(atleta2))
    println(prova3.podeRealizar(atleta2))


}