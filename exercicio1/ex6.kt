package exercicio1

fun main(){
    println(numerosPositivos())

}

fun numerosPositivos(): ArrayList<Int>{
    val listaNumerosPositivos = arrayListOf<Int>()
    for(i in 0 until 100){
        listaNumerosPositivos.add(i)
    }

    return listaNumerosPositivos
}