fun main(args: Array<String>) {

    var rocketsList: ArrayList<Rocket>
    val simulator = Simulation()
    println("---------Load U1----------")
    rocketsList = simulator.loadU1()
    simulator.launchLand(rocketsList)
    println("---------Load U2----------")
    rocketsList = simulator.loadU2()
    simulator.launchLand(rocketsList)
}


