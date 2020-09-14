package introducaoKotlin.exericio2Interface

fun main(){
    val registro = RegistroRecebimentos()

    val produto1 = ItemVenda("jogo de cadeiras", 2, 200.00)
    val produto2 = ItemVenda("Mesa", 1, 100.00)

    val servico1 = Servico("Montagem", 1, 50.00)
    val servico2 = Servico("Instalação", 2, 60.00 )

    registro.adicionarRecebimento(produto1)
    registro.adicionarRecebimento(produto2)
    registro.adicionarRecebimento(servico1)
    registro.adicionarRecebimento(servico2)
    registro.apresentarRecebimentos()

}