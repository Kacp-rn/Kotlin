class Ciricle() {

    var radius: Double = 0.0
    var str: String = ""


    fun start(): Double
    {
        println("write length of radius")
        str = readln()
        radius = str.toDouble()
        return radius
    }

    fun pole(x: Double): Double
    {
        val x = radius
        val pole:Double = Math.PI*radius*radius

        return pole
    }

    fun circuit(x: Double): Double
    {
        val x = radius
        val circuit: Double = 2 * radius * Math.PI
        println("obwód to: $circuit")
        return circuit
    }
}