var exit: Boolean = true

fun case(): Unit
{
    val rectangle1 = Rectangle()
    val circle1 = Circle()
    val triangle1 = Triangle()
    println("1. Rectangle")
    println("2. Circle")
    println("3. Triangle")
    println("4. Exit")

    when (choise())
    {
        1 -> {rectangle1.case() }
        2 -> {circle1.case() }
        3 -> {triangle1.case()}
        4 -> {exit = false}
        else ->{println("podano złą wartość, spróbuj ponownie") }
    }

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

fun main()
{
    do {
        case()
        Thread.sleep(2000)
    } while(exit)

//    val cirlcle1 = Ciricle()
//    cirlcle1.circuit(cirlcle1.start())
//    println("pole kola to: " + cirlcle1.pole(cirlcle1.start()))

 //  val rectangle1 = Rectangle()
 //  println(rectangle1.obw(rectangle1.start_a(),rectangle1.start_b()))
 //  println(rectangle1.pole(rectangle1.start_a(),rectangle1.start_b()))
}