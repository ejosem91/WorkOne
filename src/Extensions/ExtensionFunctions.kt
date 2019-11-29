package Extensions

fun Int.shieldOrNot(num : Int): Boolean{
    val multi =  num % 3
    return  multi == 0
}
