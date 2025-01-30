fun main(args: Array<String>) {
    val number = 100

    for (i in 1..number) {
        var output = ""
        if (i % 3 == 0) {
            output += "Fizz"
        }
        if (i % 5 == 0) {
            output += "Buzz"
        }

        if (output === "") {
            println(i)
        } else {
            println(output)
        }
    }
}