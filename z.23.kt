fun main(){
    try{
        print("Введите x: ")
        val x = readLine()?.toDoubleOrNull() ?: return
        print("Введите y: ")
        val y = readLine()?.toDoubleOrNull() ?: return
        val result = when {
            (Math.abs(x) / 3 + Math.abs(y)) <= 1 -> "Точка принадлежит области A"
            (x in -1.0..1.0 && y in 0.0..2.0) || (y >= 2 && y <= 3 && Math.abs(x) <= (3 - y)) -> "Точка принадлежит области B"
            (x in -1.0..1.0 && y in 0.0..2.0) || (x * x + y * y <= 1 && y >= 0) -> "Точка принадлежит области C"
            (Math.abs(x) + Math.abs(y)) <= 2 -> "Точка принадлежит области D"
            else -> "Точка не принадлежит ни одной из областей"
        }
        println(result)
    }catch (e: Exception){
        println("Неккоректные данные")
    }
}