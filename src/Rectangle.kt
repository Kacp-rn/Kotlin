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

    fun obwod(): Double
    {
        start_a()
        start_b()
        val x = a
        val y = b
        val obw: Double = (2*x)+(2*y)
        println(obw)
        return obw
    }
    fun pole(): Double
    {
        start_a()
        start_b()
        val x = a
        val y = b
        val s:Double = x*y
        println(s)
        return s
    }

    fun choise(): Int
    {
        println("Choose an instruction:")
        var choise:Int = 0
        var choise_str:String = ""
        choise_str = readln()
        choise = choise_str.toInt()

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