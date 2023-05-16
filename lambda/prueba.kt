class prueba {

    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5)
        //el metodo reduce calcula la suma usando la funcion de flecha
        val sum = numbers.reduce { a, b -> a + b }

        println("Sum: $sum")
    }
}