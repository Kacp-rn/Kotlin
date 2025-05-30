var exit: Boolean = true

fun case(): Unit
{
    println("1. Rectangle")
    println("2. Circle")
    println("3. Triangle")
    println("4. Exit")

    when (choise())
    {
        1 -> {
            println("podaj a")
            val a:Double=readln().toDouble();
            println("podaj b")
            val b:Double=readln().toDouble();
            val rectangle1 = Rectangle(a,b);
            rectangle1.case();
            zapis(rectangle1)
        }
        2 -> {println("podaj a"); val a:Double=readln().toDouble(); val circle1 = Circle(a); circle1.case(); zapis(circle1)}
        3 -> {
            println("podaj a")
            val a:Double=readln().toDouble();
            println("podaj b")
            val b:Double=readln().toDouble();
            println("podaj c")
            val c:Double=readln().toDouble();
            val triangle1 = Triangle(a,b,c);
            triangle1.case()
            zapis(triangle1)
        }
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

fun zapis(f:Figure):Map<String, Map<String, Double>>
{
    val figury = mutableMapOf<String, MutableMap<String, Double>>()
    figury["figura${figury.size+1}"] = mutableMapOf("pole" to f.pole() , "obwod" to f.obwod())

    return figury
}

fun odczyt():Unit
{
   //TODO: make function to read figury(mutableMapOf)  :)

}

fun main()
{
    do {
        case()
        Thread.sleep(1000)
    } while(exit)
}