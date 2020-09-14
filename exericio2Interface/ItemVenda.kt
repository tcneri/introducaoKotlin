package introducaoKotlin.exericio2Interface

class ItemVenda(var produto: String, var quantidade: Int, var valor: Double) : IRecebivel{

    override fun totalizarReceita():Double{
        print("O total foi:")
        return quantidade*valor
    }

    override fun toString():String {
        return "Produto:$produto, valor: $valor e quantidade: $quantidade"
    }
}