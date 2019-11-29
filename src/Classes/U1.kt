package Classes

class U1 : Rocket() {

    private var maxWeightTonnes: Double = 18000.0
    private var cargoCarried: Double = 10000.0

    private var util = Util()

    override fun launch(): Boolean {
        val chanceExplosion = 0.05 * (cargoCarried / maxWeightTonnes)
        val probability = util.createDecimal()
        return chanceExplosion > probability
    }

    override fun land(): Boolean {
        val chanceLandingCrash = 0.01 * (cargoCarried / maxWeightTonnes)
        val probability = util.createDecimal()
        return chanceLandingCrash > probability
    }


}