package exercicioComObjetos1

fun main(){
    val cliente1 = Cliente("Maria", "Silva")
    val conta1 = Conta(5478, 896.56, cliente1)

    val cliente2 = Cliente("João", "De Jesus")
    val conta2 = Conta(6532, 452.44, cliente2)

    conta1.deposito(25.58)
    conta2.saque(80.8)


}