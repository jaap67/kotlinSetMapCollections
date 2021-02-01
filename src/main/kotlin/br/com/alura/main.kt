package br.com.alura

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    println(assistiramAmbos)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
//    println(assistiramAmbos)
    println(assistiramAmbos.distinct())

}