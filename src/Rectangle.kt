class Rectangle (a:Double,b:Double):Figure()
{
    var a: Double = a
    var b: Double = b

    override fun obwod(): Double
    {
        val x = a
        val y = b
        val obw: Double = (2*x)+(2*y)
        println(obw)
        return obw
    }
    override fun pole(): Double
    {
        val x = a
        val y = b
        val s:Double = x*y
        println(s)
        return s
    }

    fun choise(): Int
    {
        println("Choose an instruction:")
        val choise:Int = readln().toInt()

        return choise
    }

    fun case(): Unit
    {
        println("1. Oblicz obwód")
        println("2. Oblicz pole")
        println("3. Exit")



        when (choise())
        {
            1->{obwod() }
            2->{pole()}
            3->{exit = false}
            else->{println("podano złą wartość, spróbuj ponownie")}
        }
    }
}