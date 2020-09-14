package exercicioComObjetos1

class Conta(var nConta: Int, var saldo: Double, val titular:Cliente ) {
    fun deposito(quantia: Double){
        saldo += quantia
        println("O tipo da transação é depósito")
        println("O novo saldo é $saldo")
    }

    fun saque(quantia: Double){
        if (quantia > saldo){
            println("Saldo insuficiente")
        }
        else{
            saldo -= quantia
            println("Transação de saque realizada")
            println("Novo saldo é $saldo")
        }
    }
}