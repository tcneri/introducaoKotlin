package exercicioComObjetos2

class sessaoDeTreinamento(var exp: Int) {
    fun treinar(jogador: jogadorDeFutebol){

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 1

        println("A experiencia inicial é $exp e a final é ${jogador.experiencia} do jogador ${jogador.nome}")
    }
}