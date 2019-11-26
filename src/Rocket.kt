open class Rocket():SpaceShip {
    var weightMax: Int = 0
    var weightRocket:Int = 0
    override fun launch(): Boolean {
        return  true
    }

    override fun land(): Boolean {
        return  true
    }

    override fun canCarry(item: Item): Boolean {
        //println(weightRocket + item.weight)
        return   weightRocket + item.weight <= weightMax
    }

    override fun carry(item: Item) {
        println("Entro")
        weightRocket += item.weight
    }

}