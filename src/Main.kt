var exit: Boolean = true

fun case(): Unit
{
    println("1. Rectangle")
    println("2. Circle")
    println("3. Triangle")
    println("4. Exit")

    when (choise())
    {
        1 -> {val a:Double=readln().toDouble(); val b:Double=readln().toDouble(); val rectangle1 = Rectangle(a,b); rectangle1.case();}
        2 -> {val a:Double=readln().toDouble(); val circle1 = Circle(a); circle1.case() }
        3 -> {val a:Double=readln().toDouble(); val b:Double=readln().toDouble();val c:Double=readln().toDouble(); val triangle1 = Triangle(a,b,c);triangle1.case()}
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

    figury["figura1"] = mutableMapOf("pole" to 0.0, "obwod" to 15.0)
}

fun main()
{
    do {
        case()
        Thread.sleep(1000)
    } while(exit)
}