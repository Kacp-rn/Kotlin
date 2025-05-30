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

fun zapis():Unit
{
    val figury = mutableMapOf<String, MutableMap<String, Double>>()

    figury["figura1"] = mutableMapOf("pole" to , "obwod" to 15.0)
}

fun main()
{
    do {
        case()
        Thread.sleep(2000)
    } while(exit)
}