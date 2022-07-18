package br.com.alura

fun testaMaps2(){
    val pedidos = mutableMapOf(Pair(1,20.0),Pair(2,34.0), 3 to 50.0, 4 to 60.0, 5 to 150.0, 6 to 200.0)
    println(pedidos)

    val valorPedido = pedidos.getValue(1)
    println(valorPedido)

    val mensagem = pedidos.getOrElse(0,{
        0.0
    })
    println(mensagem)

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))
    println(pedidos.keys)
    println(pedidos.values)


    val pedidosFiltrados = pedidos.filter{ ( numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues{ valor -> valor > 70.0}
    println(pedidosAcima)
    val pedidosPares = pedidos.filterKeys{ numero -> numero % 2 == 0}
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))

    println(pedidos - 6)
    println(pedidos - listOf(6,5))


    pedidos.putAll(setOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0))
    pedidos +=  (setOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0))
    println(pedidos)

}
