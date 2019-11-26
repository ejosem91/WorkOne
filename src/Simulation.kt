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
        var listForRocket = listOf<Item>()
        listForRocket = loadItems() // get list from loadItes
        val totalWeight :Int =  listForRocket.sumBy{ it.weight ?: 0}
    }

}