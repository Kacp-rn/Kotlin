abstract class Figure()
{
    companion object
    {
        val figury = mutableMapOf<String, MutableMap<String, Double>>()

        fun odczytWszystkich() {
            if (figury.isEmpty()) {
                println("Brak zapisanych figur.")
                return
            }

            figury.entries.joinToString("\n") { (nazwa, dane) ->
                val srodek = dane.entries.joinToString { "${it.key}: ${it.value}" }
                "$nazwa -> $srodek"
            }.also { println(it) }
        }
    }
    abstract fun pole(): Double
    abstract fun obwod(): Double

    fun zapis():Map<String, Map<String, Double>>
    {
        figury["figura${figury.size+1}"] = mutableMapOf("pole" to pole() , "obwod" to obwod())

        return figury
    }
}