import kotlin.math.sqrt

class Operaciones(var n1: Double, var n2: Double) {
    fun res(): Double {
        val res = this.n1 - this.n2
        println(res)
        return res
    }

    fun sum(): Double {
        val sum = this.n1 + this.n2
        println(sum)
        return sum
    }

    fun div(): Double {
        val div = this.n1 / this.n2
        println(div)
        return div
    }

    fun raiz(): Double {
        val raiz = sqrt(this.n1)
        println(raiz)
        return raiz
    }
}
