fun main(){
    try{
        println("Введите координаты точки М1: ")
        val x1 = readln()!!.toDouble()
        val y1 = readln()!!.toDouble()
        println("Введите координаты точки М2: ")
        val x2 = readln()!!.toDouble()
        val y2 = readln()!!.toDouble()
        println("Введите координаты точки N1: ")
        val x3 = readln()!!.toDouble()
        val y3 = readln()!!.toDouble()
        println("Введите координаты точки N2: ")
        val x4 = readln()!!.toDouble()
        val y4 = readln()!!.toDouble()

        val A1 = y2-y1
        val B1 = x1-x2
        val C1 = x2 * y1 - x1 * y2

        val A2 = y4-y3
        val B2 = x3-x4
        val C2 = x4 * y3 - x3 * y4

        when {
            A1 * B2 == A2 * B1 -> println("Прямые параллельны")
            else -> {
                val d = A1 * B2 - A2 * B1
                val xInt = (B1 * C2 - B2 * C1) / d
                val yInt = (A2 * C1 - A1 * C2) / d
                println("Прямые пересекаются в точке (%.3f, %.3f)".format(xInt, yInt))
            }
        }
    }catch (e: Exception){
        println("Неккоректные данные")
    }
}