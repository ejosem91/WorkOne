import java.util.*

class U1 :Rocket() {
   private  var maxWeightTonnes:Int =18
   private  var vargoCarried: Int = 100000

    override fun launch(): Boolean {
        val chaceExplosion = 0.05 *(vargoCarried/tonneToKgm(maxWeightTonnes))
        val  probability = createDecimal()
        return probability > chaceExplosion
    }

    override fun land(): Boolean {
        val chanceLandingCrash = 0.01 * (vargoCarried/tonneToKgm(maxWeightTonnes))
        val probability   = createDecimal()
        return probability >chanceLandingCrash
    }

    private fun tonneToKgm(maxWeight: Int): Int{
        return maxWeight * 1000
    }

    private fun createDecimal(): Double{
        val ramdomCreated = Random()
        return  ramdomCreated.nextDouble()
    }
}