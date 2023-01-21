fun main() {
    for (i in 1..16) {
        for (j in 1..16) {
            if (i == j || i + j == 17) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}