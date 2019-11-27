class U1 :Rocket() {
   private  var maxWeightTonnes:Int =18
   private  var cargoCarried: Int = 100000

   private  var util = Util()

    override fun launch(): Boolean {
        val chanceExplosion = 0.05 * (cargoCarried/util.tonneToKgm(maxWeightTonnes))
        val  probability = util.createDecimal()
        return  probability < chanceExplosion
    }

    override fun land(): Boolean {
        val chanceLandingCrash = 0.01 * (cargoCarried/util.tonneToKgm(maxWeightTonnes))
        val probability   = util.createDecimal()
        return probability < chanceLandingCrash
    }


}