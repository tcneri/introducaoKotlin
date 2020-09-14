package introHerancAbstra

open class Felino(open val cor:String = "") : Animal(){
    final override fun locomover() {
        for (passos in 0..2){
            println("O felino da cor $cor está se locomovendo")
        }
    }

    override fun come(comida: String): String {
        return comida
    }

}