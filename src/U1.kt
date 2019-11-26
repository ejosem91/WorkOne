import java.util.*

class U1 :Rocket() {
   private  var maxWeightTonnes:Int =18
   private  var vargoCarried: Int = 100000
     var util = Util()

    override fun launch(): Boolean {
        val chaceExplosion = 0.05 *(vargoCarried/util.tonneToKgm(maxWeightTonnes))
        val  probability = util.createDecimal()
        return probability > chaceExplosion
    }

    override fun land(): Boolean {
        val chanceLandingCrash = 0.01 * (vargoCarried/util.tonneToKgm(maxWeightTonnes))
        val probability   = util.createDecimal()
        return probability >chanceLandingCrash
    }


}