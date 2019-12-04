import java.util.*

fun main(){

    val yearOfBirth = readLine()!!.toInt()
    val calendar = Calendar.getInstance().get(Calendar.YEAR)
    val age = calendar - yearOfBirth
    print(age)
}