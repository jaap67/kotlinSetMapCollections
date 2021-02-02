package br.com.alura

fun main() {

    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("Pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }
}