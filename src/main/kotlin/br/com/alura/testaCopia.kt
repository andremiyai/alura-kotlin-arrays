package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(banco.nomes)
}

class BancoDeNomes{

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun exercicio1(){
    val nomes: MutableList<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    nomes.add("Paulo")
    nomes.remove("Alex")

    for(nome in nomes){
        println(nome)
    }

    println(nomes)
    println("tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}