import java.util.*

class Util {
    fun tonneToKgm(maxWeight: Int): Int{
        return maxWeight * 1000
    }

    fun createDecimal(): Double{
        val ramdomCreated = Random()
        return  ramdomCreated.nextDouble()
    }
}