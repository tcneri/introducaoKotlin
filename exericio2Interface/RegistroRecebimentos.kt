package introducaoKotlin.exericio2Interface

class RegistroRecebimentos {
    var listaDeRecebidos = mutableListOf<IRecebivel>()


    fun adicionarRecebimento(r: IRecebivel) {
            listaDeRecebidos.add(r)
    }

    fun apresentarRecebimentos(){
       for (r in listaDeRecebidos){
           println(r.totalizarReceita())
           println(r.toString())
       }

    }
}