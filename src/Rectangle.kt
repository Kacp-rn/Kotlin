class Rectangle ()
{
    var a: Double = 0.0
    var b: Double = 0.0

    var str1:String = ""
    var str2:String = ""

    fun start_a(): Double {
        println("write length of a")
        str1 = readln()
        a = str1.toDouble()
        return a
    }
    fun start_b():Double
    {
        println("write length of b")
        str2 = readln()
        b = str2.toDouble()

        return b
    }

    fun obw(x:Double, y:Double): Double
    {
        val x = a
        val y = b
        val obw: Double = (2*x)+(2*y)
        return obw
    }
    fun pole(x: Double, y:Double): Double
    {
        val x = a
        val y = b
        val s:Double = x*y
        return s
    }
}