package br.com.alura.list

fun main(){

    val livro1 = Livro("Titulo 1", "Jose da Silva", 2022, "Editora A")
    val livro2 = Livro("Titulo 2", "Joel da Silva", 2021, "Editora A")
    val livro3 = Livro("Titulo 3", "Joao da Silva", 2020, "Editora A")
    val livro4 = Livro("Titulo 4", "Joselito da Silva", 2019, "Editora A")


    val livros: MutableList<Livro> = mutableListOf(livro1,livro2,livro3,livro4)

    livros.add(Livro(autor = "Joselia da silva", anoPublicacao = 2021, titulo = "Titulo add"))

    livros.imprimeComMarcadores()

    var ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy{ it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    listaLivros
        .filter{ it.autor.startsWith("J")}
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos = listaLivros
        .filter{ it.autor.startsWith("J")}
        .sortedBy { it.anoPublicacao }
        .map{ it.titulo }

    println(titulos)
}

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n"){
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}