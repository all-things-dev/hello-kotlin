fun main()
{
    println("Kotlin".isNaturalNumber()) // false
    println("789".isNaturalNumber()) // true
}

fun String.isNaturalNumber(): Boolean
{
    return matches("[0-9]+".toRegex())
}
