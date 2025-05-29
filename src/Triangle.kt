class Triangle() :Figure() {

    //zmiana

    var str1:String = ""
    var str2:String = ""
    var str3:String = ""
    var str_height:String = ""

    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    var height:Double = 0.0

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

    fun start_c(): Double {
        println("write length of c")
        str3 = readln()
        c = str3.toDouble()
        return c
    }

    fun height():Double
    {
        println("write length of triangle's height")
        str_height = readln()
        height = str_height.toDouble()
        return height
    }

    override fun obwod(): Double
    {
        start_a()
        start_b()
        start_c()
        val obwod:Double = a+b+c
        println("obwód wynosi: $obwod")
        return obwod
    }
    override fun pole(): Double
    {
        start_a()
        height()
        val pole:Double = (a*height)/2
        println("pole wynosi: $pole")
        return pole
    }

    fun case(): Unit
    {
        println("1. Oblicz obwód")
        println("2. Oblicz pole")
        println("3. Exit")



        when (choise())
        {
            1->{obwod()}
            2->{pole()}
            3->{exit = false}
            else->{println("podano złą wartość, spróbuj ponownie")}
        }
    }

}