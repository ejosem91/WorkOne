class U2 : Rocket() {

    private var maxWeightTonnes: Double = 29000.0
    private var cargoCarried: Double =  18000.0

    private var util = Util()

    override fun launch(): Boolean {
        val chanceExplosion = 0.04 * (cargoCarried / maxWeightTonnes)
        val probability = util.createDecimal()
        return chanceExplosion > probability
    }

    override fun land(): Boolean {
        val chanceLandingCrash = 0.08 * (cargoCarried / maxWeightTonnes)
        val probability = util.createDecimal()
        return chanceLandingCrash > probability
    }
}