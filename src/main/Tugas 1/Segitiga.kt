fun main() {
    val lebar = 8
    var k = 0

    for(i in 1..lebar) {
        for(space in 1..lebar - i){
            print(" ")
        }
        while (k !=2 * i - 1) {
            print("*")
            ++k
        }

        println()
        k = 0
    }
}