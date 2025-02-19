fun main(){
    try{
        println("Введите вещественное число a: ")
        val a = readln()!!.toDouble()
        println("Введите вещественное число b: ")
        val b = readln()!!.toDouble()
        println("Введите вещественное число c: ")
        val c = readln()!!.toDouble()
        when{
            a + b > c && a + c > b && b + c > a -> {
                val perim = a + b + c
                val s = perim /2
                val area = Math.sqrt(s * (s-a) * (s-b) * (s-c))
                println("Площадь треугольника:  %.3f".format(area))
                println("Периметр треугольника: %.3f".format(perim))
            }
            else -> {
                println("Заданные длины не могут быть использовваны")
            }
        }
    }catch (e: Exception){
        println("Неккоректные данные")
    }
}