package introducaoKotlin.exBanco

open class Conta(open var saldo: Double, open var cliente: Cliente) {

    fun depositar(quantia:Double){

        saldo += quantia
        println("Depósito realizado com sucesso, seu saldo atual é $saldo")
    }

    open fun sacar(quantia: Double){
        if (quantia > saldo){
            println("Não foi possível realizar o saque, saldo insuficiente")
        }
        else{
            saldo -= quantia
            println("Saque realizado com sucesso, seu saldo atual é $saldo")
        }
    }

    fun consultar(): String{
        return "Seu saldo atual é $saldo"
    }




}