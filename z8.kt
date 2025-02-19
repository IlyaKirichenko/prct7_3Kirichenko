fun main(){
    try{
        println("Введите коэффициент a: ")
        val a = readln()!!.toDouble()
        println("Введите коэффициент b: ")
        val b = readln()!!.toDouble()
        println("Введите коэффициент c: ")
        val c = readln()!!.toDouble()
        when {
            a == 0.0 -> {
                println("Коэффициент а не может быть равен 0")
            }
            else ->{
             val xV = -b / (2*a)
                val yV = a * xV * xV +b * xV +c
                println("Координаты вершины параболы: X = $xV; Y = $yV")
            }
        }
    }catch (e: Exception){
        println("Неккоректные данные")
    }
}