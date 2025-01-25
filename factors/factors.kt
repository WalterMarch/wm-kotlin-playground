fun main(args: Array<String>){
    var number = 100
    val factorSet: MutableSet<Int> = mutableSetOf(1, number)

    for (i in 2..number-1) {
        if (number % i == 0) {
            factorSet.add(i)
            factorSet.add(number / i)
        }
    }
    println(factorSet.sorted())
}