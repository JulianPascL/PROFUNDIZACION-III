
fun main() {
    val op = Operaciones(5.5, 7.2)
    val resultados = mutableListOf<Pair<String, Double>>()

    println("------RESTA-------")
    resultados.add("Resta" to op.res())

    println("------SUMA------")
    resultados.add("Suma" to op.sum())

    println("------DIVISION-------")
    resultados.add("División" to op.div())

    println("--------RAÍZ-------")
    resultados.add("Raíz" to op.raiz())

    println("\nLista de Resultados:")
    resultados.forEach { (operacion, resultado) ->
        println("$operacion: $resultado")
    }
}

