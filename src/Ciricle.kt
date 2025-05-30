class Circle(a: Double) : Figure() {

    var radius: Double = a

    override fun pole(): Double
    {
        val x = radius
        val pole:Double = Math.PI*radius*radius
        println(pole)
        return pole
    }

    override fun obwod(): Double
    {
        val x = radius
        val circuit: Double = 2 * radius * Math.PI
        println("obwód to: $circuit")
        return circuit
    }

//    fun pole(x: Double): Double
//    {
//        val x = radius
//        val pole:Double = Math.PI*radius*radius
//        println(pole)
//        return pole
//    }

//    fun circuit(x: Double): Double
//    {
//        val x = radius
//        val circuit: Double = 2 * radius * Math.PI
//        println("obwód to: $circuit")
//        return circuit
//    }
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
            1->{obwod ()}
            2->{pole()}
            3->{exit = false}
            else->{println("podano złą wartość, spróbuj ponownie")}
        }
    }
}