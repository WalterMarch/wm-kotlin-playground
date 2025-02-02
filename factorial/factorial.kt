fun factorial(n: Int) : Int {
    var output = 1
    if (n > 1) {
        output = n * (factorial(n-1))
    }
    return output
}

fun main(args: Array<String>){
    println(factorial(6))
}