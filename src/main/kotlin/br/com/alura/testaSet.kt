fun testaSet(){
    val assistiramCursoAndroid = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = mutableSetOf("Alex", "Paulo", "Maria")

//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoKotlin +assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoKotlin  - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())

}