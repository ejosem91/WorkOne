import java.io.File

class Simulation {

    fun loadItems():ArrayList<Item>{
        var array = arrayOf<String>()
        var arrListItems : ArrayList<Item> = ArrayList()
        File("../../desktop/phase-1.txt").forEachLine{
            array =  it.split("=").toTypedArray()
            arrListItems.add(Item(array[0].toString(),array[1].toInt()))
        }
        return arrListItems
    }

    fun loadU1(){
        var listForRocket = listOf<Item>()
        listForRocket = loadItems() // get list from loadItes
        var totalWeight :Int =  listForRocket.sumBy{ it.weight ?: 0}
    }

}