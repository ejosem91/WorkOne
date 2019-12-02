import classes.Rocket
import classes.Simulation

fun main() {
    //Invoke classes for fill and launch Rockets
    var rocketsList: ArrayList<Rocket>
    val simulator = Simulation()
    println("---------Load Classes.U1----------")
    rocketsList = simulator.loadU1()
    simulator.launchLand(rocketsList)
    println("---------Load Classes.U2----------")
    rocketsList = simulator.loadU2()
    simulator.launchLand(rocketsList)
}


