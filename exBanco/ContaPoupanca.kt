package introducaoKotlin.exBanco

class ContaPoupanca(override var saldo: Double, override var cliente: Cliente, var txDeJuros: Double) : Conta( saldo, cliente){
    fun depositarPoupanca(quantia:Double){

        super.depositar(quantia)

    }

    fun sacarPoupanca(quantia: Double){
        super.sacar(quantia)
    }

    fun consultarPoupanca(){
        super.consultar()
    }



//    fun recolherJuros(quantia: Double){
//        saldo -= quantia
//        println("Juros recolhidos com sucesso. Seu saldo atual é, $saldo.")
//    }
}