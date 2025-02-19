fun main(){
    try{
        println("Введите сторону равностореннего треугольника: ")
        val a = readln()!!.toDouble()
        when{
            a <= 0.0 -> {
                println("Коэффициент а не может быть равен 0")
            }
            else ->{
               val area = (Math.sqrt(3.0)/4)*a*a
                val opis = a /Math.sqrt(3.0)
                val vpis = (a * Math.sqrt(3.0))/6
                println("Площадь треугольника:  %.3f".format(area))
                println("Радиус описанной окружности: %.3f".format(opis))
                println("Радиус вписанной окружности: %.3f".format(vpis))
            }
        }
    }catch (e: Exception){
        println("Неккоректные данные")
    }
}