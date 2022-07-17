package br.com.alura.array

fun main(){
    var idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val max = idades.maxOrNull()
    println("Max: $max")

    val min = idades.minOrNull()
    println("Min: $min")

    val media = idades.average()
    println("Media: $media")

    val todosMaiores = idades.all{it >= 18}
    println("Todos Maiores? $todosMaiores")

    val existeMaior = idades.any{it >= 18}
    println("Algum aluno é maior de idade? $existeMaior")

    val idadesfiltradas = idades.filter{ it > 18}
    println("Maiores: $idadesfiltradas")

    val busca = idades.filter{ it >=18 }
    println("Maiores igual 18: $busca")
}