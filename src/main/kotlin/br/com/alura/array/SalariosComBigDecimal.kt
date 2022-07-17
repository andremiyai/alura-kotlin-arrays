package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    val salarios = bigDecimalArrayOf( "1500.55","2000.00","5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento:  Array<BigDecimal> = salarios
        .map{ salario ->
            calculaAumentoRelativo(salario, aumento)
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatorio()
    println(gastoInicial)


    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2,RoundingMode.UP)
    }

    println(gastoTotal)


    val salariosOrdenados = salariosComAumento.sorted()
    val media = salariosOrdenados.takeLast(3).toTypedArray().media()

    println("Média: $media ")
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatorio(): BigDecimal{
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatorio() / this.size.toBigDecimal()
    }
}