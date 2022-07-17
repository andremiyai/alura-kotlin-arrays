package br.com.alura.array

fun main(){
   val serie: IntRange = 1.rangeTo(10)
   for(s in serie){
      print("$s ")
   }
   println()
   val numerosPares = 0..100 step 2
   for(numeroPar in numerosPares){

      print("$numeroPar ")
   }

   println()
   val numerosParesUntil = 0 until(100) step 2
   for(numeroPar in numerosParesUntil){

      print("$numeroPar ")
   }

   println()
   val numerosParesDownTo = 100 downTo (0) step 2
   for(numeroReverso in numerosParesDownTo){

      print("$numeroReverso ")
   }

   println()

   val intervalo = 1500.0 .. 5000.0
   val salario = 4000.00

   if(salario in intervalo){
      println("está dentro")
   }else{
      println("não ta dentro")
   }

   println()

   val alfabeto = 'a' .. 'z'
   val letra = 'd'
   if(letra in alfabeto){
      println("está dentro")
   }else{
      println("está fora")
   }

}