package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    /**
     * essa linha de cima pode ser a mesma coisa que usar a função plus() abaixo.
     * outro detalhe importante, é que quando utilizamos a soma, ela não devolve uma referência mutável.
     * */
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid.plus(assistiramCursoKotlin)
    /**
     * Aqui dependendo de quem vem primeiro, ou a variável set ou list, a variável que está recebenco a soma, passa a ser
     * do mesmo tipo da primeira que foi adicionada, no exemplo, do tipo set -> (assistiramCursoAndroid)
     * */
    val assistiramAmbos = mutableSetOf<String>()
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    println(assistiramAmbos)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
//    println(assistiramAmbos)
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

}