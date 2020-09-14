package exercicioComObjetos5

fun main(){
    val v1 = Veiculo("Fiat", "Argo sedan", 2020, "Branco", 80.4)
    val cliente1 = Cliente("Maria", "Silva", "mariaS@gmail.com")
    val venda = Concessionaria()

    venda.registrarVenda(v1,cliente1, 69999.99)
}