/*
fun main()
{
    println("Hello Kotlin")
}
*/

/*
fun main(vararg args: String)
{
    println("Hello Kotlin")
}
*/

fun main(args: Array<String>)
{
    println("Hello Kotlin")
}

object Main
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        println("Hello Kotlin")
    }
}

class ObjectMain
{
    object Main
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println("Hello Kotlin")
        }
    }
}

class CompanionMain
{
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println("Hello Kotlin")
        }
    }
}

class NamedCompanionMain
{
    companion object Main
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println("Hello Kotlin")
        }
    }
}
