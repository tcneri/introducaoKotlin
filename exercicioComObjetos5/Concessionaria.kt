package exercicioComObjetos5

class Concessionaria {
    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor:Double){
        println("Venda do ${veiculo.modelo} para o ${cliente.nome + " " + cliente.sobrenome} por $valor, realizada com sucesso!")
    }
}