fun main(){
    var names2 = names(listOf("Ashly", "Loise", "Jay", "Cassandra", "Jake", "Viviane", "Carson", "Daphine", "Theo", "Espe"))
    createPersonList()
    println(listOf(22.3,55.6,76.5,77,88.0))
    println()

//    val car1=MyVuns("KYZ123E",54.6)
//    val car2=MyVuns("KCC890Z",60.9)
//    val car3=MyVuns("KAC890E",69.4)

}



//question 1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index
fun names(name:List<String>):List<String>{
    name.forEachIndexed { index, s ->
        if(index%2==0){
            println(s)
        }
    }
    return name
}





//question2
fun personHeight(heights:List<Double>):List<Double> {
    var total = heights.sum()
    var avg = heights.average()
    var result = listOf(avg, total)
    return result
}


//question 3
data class Person(val name: String, val age: Int, val height: Double, val weight: Double)

fun createPersonList() {
    val personList = listOf(
        Person("Mercy", 18, 165.0, 56.0),
        Person("Janet", 19, 170.0, 58.0),
        Person("Loice", 20, 175.0, 60.0),
        Person("Kabanyana", 21, 180.0, 62.0)
    )

    val sortedList = personList.sortedByDescending { person -> person.age}
    println(sortedList)
}

//Question4
fun person(person:List<Person>):List<Any> {
    return listOf()

}

//
//val numbers = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
//val (average, total) = getNumberStats(numbers)
//println("Average: $average")

//question5
//data class MyVuns(val registration:String,val mileage:Double)
//fun allVuns(allVun:List<MyVuns>):Double {
//    val vunMileage = allVun.sumOf { vun -> vun.mileage } / allVun.size
//    return vunMileage
//}