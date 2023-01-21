fun main() {

    for (i in 1..7) {
        for (j in 1..8 - i) {
            print(" ")
        }
        for (k in 1..i * 2 - 1) {
            print("*")
        }
        println()
    }
    println("***************")

    for (i in 7 downTo 1) {
        for (j in 1..8 - i) {
            print(" ")
        }
        for (k in 1..i * 2 - 1) {
            print("*")
        }
        println()
    }
}