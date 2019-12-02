
fun main(){

    val str:String
    str = "Welcome to Kotlin"
//    val str = "Welcome to Kotlin"

        //val jest typem zmiennej, której nie można zmienić - jes tylko do odczytu. Jeśli chcemy nadpisać później zmienną, misi być var
    println(str)

    val name = "Sawyer"
    val age = 27

    println("Name: " + name)
    println("Age: " + age)

//    ALBO

    println("Name: $name")
    println("Age: $age")
}