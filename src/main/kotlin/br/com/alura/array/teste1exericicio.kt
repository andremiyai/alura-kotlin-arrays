fun teste1exercicio() {
    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("Maior Idade: ${maiorIdade}")

    idades.forEach { idade ->
        println("Idade $idade")
    }
}