var exit: Boolean = true

fun case(): Unit
{
    println("1. Rectangle")
    println("2. Circle")
    println("3. Triangle")
    println("4. Write down each figure with its area and perimeter")
    println("5. Exit")

    when (choise())
    {
        "1" -> {
            println("podaj a")
            val a:Double=readln().toDouble();
            println("podaj b")
            val b:Double=readln().toDouble();
            val rectangle1 = Rectangle(a,b);
            rectangle1.case();
            rectangle1.zapis()
        }
        "2" -> {println("podaj a"); val a:Double=readln().toDouble(); val circle1 = Circle(a); circle1.case(); circle1.zapis()}
        "3" -> {
            println("podaj a")
            val a:Double=readln().toDouble();
            println("podaj b")
            val b:Double=readln().toDouble();
            println("podaj c")
            val c:Double=readln().toDouble();
            val triangle1 = Triangle(a,b,c);
            triangle1.case()
            triangle1.zapis()
        }
        "4"->{Figure.odczytWszystkich()}

        "5" -> {exit = false}
        else ->{println("podano złą wartość, spróbuj ponownie") }
    }

}

fun choise(): String
{
    println("Choose an instruction:")

    var choise_str:String = readln()

return choise_str
}

fun main()
{
    do {
        case()
        Thread.sleep(1000)
    } while(exit)
}