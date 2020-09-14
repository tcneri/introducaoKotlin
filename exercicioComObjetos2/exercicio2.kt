package exercicioComObjetos2

fun main(){

    val jogador1 = jogadorDeFutebol("João Silva", 50, 20, 2, 40)
    val treinoj1 = sessaoDeTreinamento(jogador1.experiencia)

    val jogador2 = jogadorDeFutebol("Pedro Costa",45, 15, 1, 35)
    val treinoj2 = sessaoDeTreinamento(jogador2.experiencia)

    treinoj1.treinar(jogador1)
    treinoj2.treinar(jogador2)
}