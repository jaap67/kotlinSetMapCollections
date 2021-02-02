package br.com.alura

fun main() {

    val pedidos = mutableMapOf<Int, Double>(
            Pair(1, 20.0),
            Pair(2, 64.0),
            3 to 50.0,
            4 to 100.0,
            5 to 150.0,
            6 to 80.0
    )

    /**
     * Se a chave não existir, o getValue() trás pra gente uma exception, para agirmos com mais precisão.
     * Também temos o get() que trás null caso nao exista a chave.
     * */
//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    val message: Double? = pedidos.getOrElse(5, {
        0.0
    }) // O getOrElse retorna ou o valor encontrado da chave ou uma expressão lambda
    println(message)
    println(pedidos.getOrDefault(1, -1.0)) // O getOrDefault retona ou o valor encontrado ou um valor padrão
    println(pedidos.getOrDefault(6, -1.0))

    println(pedidos.keys)
    println(pedidos.values)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    for (valor in pedidos.values){
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0
    }
    println(pedidosFiltrados)

    println(pedidos.filterValues { it -> it > 70.0 }) // Pedidos acima de 70
    println(pedidos.filterKeys { it -> it % 2 == 0 }) // Pedidos pares
}

