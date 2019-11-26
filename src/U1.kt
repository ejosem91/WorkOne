import java.util.*

class U1 :Rocket() {
   private  var maxWeightTonnes:Int =18
   private  var vargoCarried: Int = 100000

    override fun launch(): Boolean {
        val chaceExplosion = 0.05 *(vargoCarried/tonneToKgm(maxWeightTonnes))
        val ramdomCreated = Random()
        val ramdom = ramdomCreated.nextDouble()
        return ramdom > chaceExplosion
    }

    override fun land(): Boolean {
        return super.land()
    }

    private fun tonneToKgm(maxWeight: Int): Int{
        return maxWeight * 1000
    }
}