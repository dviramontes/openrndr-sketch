fun main() {
    iteration()
    println(sum(1, 4))
    val str: String? = "abc"
    if (str != null) {
        println(str.length)
    }
}

fun iteration() {
    val names = listOf("a", "b", "c")
    for ((index, value) in names.withIndex()) {
        println("the element at $index is $value")
    }
    repeat(names.size) {
        println(names[it])
    }
    for (i in 1 until 10) {
        println(i)
    }
}


private fun sum(a: Int, b: Int): Int {
    return a + b
}
