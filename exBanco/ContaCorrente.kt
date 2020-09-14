package introducaoKotlin.exBanco

import java.util.*

class ContaCorrente(var limiteDeCheque: Double, override var saldo: Double, override var cliente: Cliente): Conta (saldo, cliente){

    final override fun sacar(quantia: Double) {

        if (quantia > (saldo + limiteDeCheque)){
            println("Saldo atual é menor que a quantia indicada e a quantia ultrapassa o seu limite autorizado.")
        }

        else {
            val scanner = Scanner(System.`in`)
            println("Saldo atual é menor que a quantia indicada. Deseja utilizar o cheque especial?")
            var op = scanner.next()
            if ( op == "s") {
                saldo -= quantia
                println("Saque realizado com sucesso, seu saldo atual é $saldo")
            }
        }

    }

    fun depositarDinCorrente(quantia: Double){
        super.depositar(quantia)
    }

    fun depositarCheqCorrente(quantia: Cheque){
        saldo += quantia.valor
        println("Depósito do cheque do ${quantia.bancoEmissor}, data ${quantia.data}, de valor ${quantia.valor}, realizado com sucesso.")
        println("Seu saldo atual é $saldo")
    }

    fun consultarCorrente(){
        super.consultar()
    }



}


