package Calculadora

fun entradaDatos(): ArrayList<String?> {
    var array = ArrayList<String?>()

    println("Introduzca el número 1")
    var num1 = readLine()

    println("Introduzca la operación")
    var op = readLine()

    println("Introduzca el número 2")
    var num2 = readLine()

    array.add(num1)
    array.add(op)
    array.add(num2)

    return array
}

fun hacerOperacion(array: ArrayList<String?>) {
    var num1 = array[0]!!.toInt()
    var op = array[1]
    var num2 = array[2]!!.toInt()

    when(op) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "/" -> println(num1 / num2)
        "*" -> println(num1 * num2)
    }
}

fun main(args: Array<String>) {
    hacerOperacion(entradaDatos())
}