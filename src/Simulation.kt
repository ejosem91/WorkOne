import java.io.File

class Simulation {

    private val arrListRemove: MutableList<Item> = mutableListOf()
    //Method that read file on my desktop
    private fun loadItems(numPhase: Int): MutableList<Item> {
        var array: Array<String>
        val arrListItems: MutableList<Item> = mutableListOf()
        File("../../desktop/phase-$numPhase.txt").forEachLine {
            array = it.split("=").toTypedArray()
            arrListItems.add(Item(array[0], array[1].toInt()))
        }
        return arrListItems
    }

    //get list of items and fill elements with type U1() rockets
    fun loadU1(): ArrayList<Rocket> {
        var listItems: MutableList<Item>
        val listRocket = ArrayList<Rocket>()
        //run 2 phases for U1
        for (i in 1..2) {
            listItems = loadItems(i)
            var flagRepeat = true
            var counterRockets = 0

            while (flagRepeat) {
                val rocket = U1()
                rocket.weightMax = 18000
                rocket.weightRocket = 10000
                rocket.cost = 100
                listRocket.add(rocket)
                listItems.forEach { item ->
                    if (rocket.canCarry(item)) {
                        rocket.carry(item)
                        arrListRemove.add(item)
                    }
                }
                counterRockets++
                listItems.removeAll(arrListRemove)
                if (listItems.isEmpty()) {
                    flagRepeat = false
                }
            }
            listItems.clear()
        }
        println("Rocket prepared ${listRocket.size}")
        return listRocket
    }

    //get list of items and fill elements with type U2() rockets
    fun loadU2(): ArrayList<Rocket> {
        val listRocket = ArrayList<Rocket>()
        var listItems: MutableList<Item>
        //run 2 phases for U2
        for (i in 1..2) {
            listItems = loadItems(i)
            var flagRepeat = true
            var counterRockets = 0

            while (flagRepeat) {
                val rocket = U2()
                rocket.weightMax = 29000
                rocket.weightRocket = 18000
                rocket.cost = 120
                listRocket.add(rocket)

                listItems.forEach { item ->
                    if (rocket.canCarry(item)) {
                        rocket.carry(item)
                        arrListRemove.add(item)
                    }
                }
                counterRockets++
                listItems.removeAll(arrListRemove)
                if (listItems.isEmpty()) {
                    flagRepeat = false
                }
            }

        }
        println("Rocket prepared ${listRocket.size}")
        return listRocket
    }


    fun launchLand(listOfRockets: ArrayList<Rocket>): Int {
        var countFail = 0
        var totalCost = 0
        var launchCounter = 0

        listOfRockets.forEach {
            println("Launch rocket")
            totalCost += it.cost
            ++launchCounter
            //launchCounter.shieldOrNot(launchCounter)
            if (!launchCounter.shieldOrNot(launchCounter)) {
                while (it.land() || it.launch()) {
                    println("Rocket Fail!!!!")
                    countFail++
                    totalCost += it.cost
                }
            } else {
                println("Rocket with shield")
                println("Rocket with shield")
            }


        }
        println("Total rocket Fail $countFail")
        println("Ttotal budget  $totalCost")
        return totalCost
    }
}