package exercicio1

fun main(){
    println(numerosImpares())

}

fun numerosImpares(): ArrayList<Int>{
    var listaNumerosImpares = arrayListOf<Int>()
    var i=1
    while(i < 200){
        if((i %2) != 0){
            listaNumerosImpares.add(i)
            i++
        }
        else{
            i = i + 2
        }
    }

    return listaNumerosImpares
}