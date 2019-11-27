import java.io.File

class Simulation {

    private val arrListRemove: MutableList<Item> = mutableListOf()
    fun loadItems(numPhase: Int): MutableList<Item> {
        var array: Array<String>
        val arrListItems: MutableList<Item> = mutableListOf()
        File("../../desktop/phase-$numPhase.txt").forEachLine {
            array = it.split("=").toTypedArray()
            arrListItems.add(Item(array[0], array[1].toInt()))
        }
        return arrListItems
    }

    fun loadU1(): ArrayList<Rocket> {
        var listItems: MutableList<Item>
        var listRocket = ArrayList<Rocket>()
        for (i in 1..2) {
            listItems = loadItems(i)
            var flagRepeat = true
            var counterRockets: Int = 0

            while (flagRepeat) {
                val rocket = U1()
                rocket.weightMax = 18000
                rocket.weightRocket = 10000
                rocket.cost = 1000000000
                listRocket.add(rocket)
                listItems.forEachIndexed { index, item ->
                    if (rocket.canCarry(item)) {
                        rocket.carry(item)
                        arrListRemove.add(item)
                    }
                }
                counterRockets++
                println(counterRockets)
                listItems.removeAll(arrListRemove)
                if (listItems.isEmpty()) {
                    flagRepeat = false

                }
            }
            listItems.clear()
        }
        return listRocket
    }

    fun loadU2(): ArrayList<Rocket> {
        var listRocket = ArrayList<Rocket>()
        var listItems: MutableList<Item>

        for (i in 1..2) {
            listItems = loadItems(i)
            var flagRepeat = true
            var counterRockets: Int = 0
            while (flagRepeat) {
                val rocket = U2()
                rocket.weightMax = 29000
                rocket.weightRocket = 18000
                rocket.cost = 1200000000
                listRocket.add(rocket)
                listItems.forEachIndexed { index, item ->
                    if (rocket.canCarry(item)) {
                        rocket.carry(item)
                        arrListRemove.add(item)
                    }
                }
                counterRockets++
                println(counterRockets)
                listItems.removeAll(arrListRemove)
                if (listItems.isEmpty()) {
                    flagRepeat = false

                }
            }

        }
        return listRocket
    }

}