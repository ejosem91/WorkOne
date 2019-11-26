import java.io.File

class Simulation {

    fun loadItems():ArrayList<Item>{
        var array: Array<String>
        val arrListItems : ArrayList<Item> = ArrayList()
        File("../../desktop/phase-1.txt").forEachLine{
            array =  it.split("=").toTypedArray()
            arrListItems.add(Item(array[0],array[1].toInt()))
        }
        return arrListItems
    }

    fun loadU1(){
        val listItems = loadItems()
        val rocket = U1()
            rocket.weightMax = 18000
            rocket.weightRocket = 10000
            for(i in listItems.indices) {
                if (rocket.canCarry(listItems.get(i))){
                    rocket.carry(listItems.get(i))
                }

            }
    }

}