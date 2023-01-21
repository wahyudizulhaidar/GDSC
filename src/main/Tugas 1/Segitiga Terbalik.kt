fun main() {
    val lebar = 8

    for (i in lebar downTo 1) {
        for(space in 1..lebar - i) {
            print(" ")
        }

        for (j in i..2 * i - 1) {
            print("*")
        }

        for (j in 0..i - 1 - 1) {
            print("*")
        }

        println()
    }
}