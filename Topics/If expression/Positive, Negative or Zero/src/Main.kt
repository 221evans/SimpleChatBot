fun main() {
    // write your code here
    val num = readLine()!!.toInt()
    if (num < 0) {
        println("negative")
    }
    else if (num == 0) {
        println("zero")
    }
    else {
        println("positive")
    }
}