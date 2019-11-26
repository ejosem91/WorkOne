
    fun main(args:Array<String>) {
        var listOfItems = ArrayList<Item>()
        var simulator1 = Simulation()
        listOfItems = simulator1.loadItems()
        printList(listOfItems)
    }

    fun printList(listItems:ArrayList<Item>){
        for(i in listItems.indices){
            println(listItems.get(i).name)
        }
    }


