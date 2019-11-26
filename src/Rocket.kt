open class Rocket:SpaceShip {
    override fun launch(): Boolean {
        return  true
    }

    override fun land(): Boolean {
        return  true
    }

    override fun canCarry(item: Item): Boolean {
        return true
    }

    override fun carry(item: Item) {

    }

}