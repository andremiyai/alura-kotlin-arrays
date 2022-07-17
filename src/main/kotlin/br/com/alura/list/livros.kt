package br.com.alura.list

val livro1 = Livro("Titulo 1", "Jose da Silva", 2022, "Editora A")
val livro2 = Livro("Titulo 2", "Aoel da Silva", 2021, "Editora B")
val livro3 = Livro("Titulo 3", "Foao da Silva", 2020, "Editora B")
val livro4 = Livro("Titulo 4", "Eoselito da Silva", 2019, "Editora A")
val livro5= Livro("Titulo nulo", "Eoselito da Silva", 2017 )


val listaLivros: MutableList<Livro> = mutableListOf(livro1,livro2,livro3,livro4,livro5)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
Livro("Titulo 1", "Jose da Silva", 2022, "Editora A")
,Livro("Titulo 2", "Aoel da Silva", 2021, "Editora A")
,Livro("Titulo 3", "Foao da Silva", 2020, "Editora A")
    ,null
,Livro("Titulo 4", "Eoselito da Silva", 2019, "Editora A")


)