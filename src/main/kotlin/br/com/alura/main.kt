package br.com.alura

fun main() {
    /**
     * Mudando o tipo para mutableList, para testarmos os outros métodos disponíveis
     * */
    val pedidos = mutableMapOf<Int, Double>(
            Pair(1, 20.0),
            Pair(2, 34.0),
            3 to 50.0)

    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("Pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número do p: ${p.key}")
        println("Valor do p: ${p.value}")
    }
    pedidos[4] = 70.0 // Adicionando um item na maneira convencional
    println(pedidos)
    pedidos.put(5, 80.0) // Adiconando com o método plus
    println(pedidos)
    pedidos[1] = 100.0 // Também é possível alterar o item dessa maneira normal
    println(pedidos)
    pedidos.put(5, 90.0) // Serve para atualizar um item já existente no map
    pedidos.putIfAbsent(6, 200.0) // So adicona o dado caso não exista o item com chave 6
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0) // Aqui não será adicionado, pois já exite um item com chave igual a 6
    println(pedidos)
    pedidos.remove(6) // Remove o item se a chave existir
    println(pedidos)
    pedidos.remove(3, 100.0) // Remove apenas se bater tanto a chave quanto o valor
    println(pedidos)
}