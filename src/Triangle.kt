class Triangle(a:Double, b:Double, c: Double) :Figure() {

    var a: Double = a
    var b: Double = b
    var c: Double = c

   override fun obwod(): Double
    {
        val obwod:Double = a+b+c
        println("obwód wynosi: $obwod")
        return obwod
    }
    override fun pole(): Double
    {
        val p:Double = (a+b+c)/2
        val pole:Double = Math.sqrt(p * (p - a) * (p - b) * (p - c))
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
            "1"->{obwod()}
            "2"->{pole()}
            "3"->{exit = false}
            else->{println("podano złą wartość, spróbuj ponownie")}
        }
    }

}