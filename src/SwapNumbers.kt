fun main() {

    println("Enter two numbers and I will swap them")
    print("First: ")
    var x = readLine()!!.toInt()
    print("Second: ")
    var y = readLine()!!.toInt()

    var temp:Int
    temp = x
    x = y
    y = temp

    println("First: $x")
    println("Second: $y")
}