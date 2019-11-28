fun main(args: Array<String>) {
    //Invoke classes for fill and launch Rockets
    var rocketsList: ArrayList<Rocket>
    val simulator = Simulation()
    println("---------Load U1----------")
    rocketsList = simulator.loadU1()
    simulator.launchLand(rocketsList)
    println("---------Load U2----------")
    rocketsList = simulator.loadU2()
    simulator.launchLand(rocketsList)

    //var text = "Jose"
    //text.show(text)
    //var result : Int? =0
    //result?.sumCustum(2,4)



}


