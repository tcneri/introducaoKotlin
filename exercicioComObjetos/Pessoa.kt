package exercicioComObjetos

class Pessoa(var nome: String, var sobrenome: String) {
    //propriedades que já estão sendo inicializadas
//    var nome: String = "João"
//    var idade: Int = 19
//    val sobrenome: String = "Santos"

//    init {
//        println("Nome é $nome")
//    }
//    var sexo:String = "M"
//
//    init {
//        println("sexo e: $sexo")
//    }
//    fun andar(){
//    println("A pessoa está andando $nome")
//    }

    private fun criarRG(nome:String, numero:Int): String{
        return nome + numero
    }
    //usando a classe cachorro
    fun passearComDog(cachorro: Cachorro){
        println("Estou passeando com o meu cachorro ${cachorro.nome}")
    }
}