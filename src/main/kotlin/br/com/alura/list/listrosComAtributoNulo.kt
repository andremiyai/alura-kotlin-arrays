package br.com.alura.list

fun main(){
    listaLivros
        .groupBy{ it.editora ?: "editora Desconhecida "}
        .forEach{ (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}