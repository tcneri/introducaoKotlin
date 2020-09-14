package introHerancAbstra

fun main(){
    println("OBJETO PESSOA --------------------------------")
    val brasileiro = Pessoa(19, "ser humano", "João")
    brasileiro.locomover()
    brasileiro.idadePessoa()

    println("OBJETO FELINO------------------------------------")
    val pantera = Felino()
    pantera.locomover()

    println("OBJETO GATO---------------------------------------")
    val gatinhoDePelucia = Gato()
    gatinhoDePelucia.locomover2()



}