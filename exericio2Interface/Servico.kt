package introducaoKotlin.exericio2Interface

class Servico(var descricao: String, var horas: Int, var precoHora: Double) : IRecebivel {

    override fun totalizarReceita():Double{
        print("O total foi:")
        return horas*precoHora
    }

    override fun toString() : String{
        return "Serviço: $descricao, horas: $horas, preço por hora: $precoHora"
    }

}