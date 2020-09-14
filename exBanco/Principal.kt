package introducaoKotlin.exBanco

fun main(){
    val cliente1 = Cliente(785, "Costa", 7847854795, 78945665478)
    val contac1 = ContaPoupanca(5478.4, cliente1, 0.4)

    val cliente2 = Cliente(451203, "De Jesus", 7414789632, 88899988810)
    val contac2 = ContaCorrente(632.99, 4520.4, cliente2)

    val cheque = Cheque(100.00, "Banco do Brasil", "07/10/2020")

    println("OBJETO CP ----------------------------------------------------------------------------------")
    contac1.sacarPoupanca(101.00)
    contac1.consultarPoupanca()
    contac1.depositarPoupanca(485.10)

    println("OBJETO CC ----------------------------------------------------------------------------------")
    contac2.depositarDinCorrente(78.00)
    contac2.consultarCorrente()
    contac2.sacar(4000.00)
    contac2.depositarCheqCorrente(cheque)

}



