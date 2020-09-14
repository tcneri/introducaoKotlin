package introHerancAbstra

class Gato : Felino() {
    override val cor: String = "amarelo"

    fun locomover2(){
        super.locomover()
        println("A cor é $cor")
    }
}