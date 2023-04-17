import java.util.Calendar

fun main() {
var car=Car("Subaru","Legacy","Blue",4)
car.carry(4)
car.carry(7)
car.identity()
    car.calculateParkingFees(6)
var bus=Bus("Honda","Typec","white",44)
    bus.maxTripFare(45.0)
    bus.calculateParkingFees(3)
    logic("Clarine")
     var names=firstChar(" wanjiru","bomas kenya")
println(names)
    var numb=interiors(arrayOf(3,4,67,89,12,9,5,79,))
    println(numb)
    fullName("Mercy")
var passenger=join(arrayOf("Mercy" ,"Tom","Ann"))
    println(passenger)
    var calc=Calculator(12.0,13.0)
    calc.add()
    calc.subtract()
    calc.div()
    calc.multiply()
    oddNumber()
even()
    reverse()
    sort()
    filter()
    namesis()
    boolen()
    namesOf(arrayOf("Mary","Ann","Mercy"))
    var numb2 = numbers(arrayOf(34,20,3,4,1,0))
    println(numb2)
    println( numbersArray(arrayOf(23,4,6,8,12,45,7,9)))
    whil()
    agePrice(44)
    var person=Person("Mercy",12)
    person.speak()
    println(person.age)
    var vehicle=Vehicle("Toyota","Subaru",2020)
    vehicle.start()
    println(vehicle.make)
    var rectangle=Rectangle(30.5,40.0)
    println(rectangle.area())

}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if (people<=capacity){
            println("Carry $people passenger")
        }
        else if (people>capacity){
            println("over capacity by $people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours:Int):Int{
        return (hours *20)
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return capacity *fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return super.calculateParkingFees(hours)
    }
}
fun logic(name:String):String{
return when{
    name == "Mary" -> "one for name,one for me"
    else   -> "One for you one for me"}

}
fun firstChar(name1:String,name2:String):Char{
if (name1.length>=name2.length)
{
    return  name1[0]
}
    else {
        return name2[0]
    }

}
fun interiors(num:Array<Int>):Triple<Int,Int,Double>{
    var num1=num.max()
    var num2=num.min()
    var num3=num.average()
    return Triple(num1,num2,num3)
}
fun fullName(name:String){
    println(name.split(""))
}
fun join(name: Array<String>):String{
    return name.joinToString("")
}
class Calculator(var num1:Double,var num2:Double){
    fun add(){
      println(num1+num2)
    }
    fun subtract(){
        println(num1-num2)
    }
    fun div(){
        println(num1/num2)
    }
    fun multiply (){
        println(num1*num2)
    }
}
fun oddNumber(){
    for (n in 1..100 step 2)
        println(n)
}

data class Stats(val min:Int,val max:Int,val average:Double){

    fun arrayStats(numbers:Array<Int>):Stats{
        val min=numbers.min()
        val max=numbers.max()
        val average=numbers.average()
        val stats=Stats(min,max,average)
        return stats
    }
}
fun even(){

    for (i in 0..10 step 2){
        println(i)
    }

}
fun table(){
    for (i in 1..10){

    }
}
fun sum(){
    for (i in 1..10){

    }
}
fun reverse(){
  var  numb= arrayOf(3,4,5,6,7)
    println(numb.contentToString().reversed())

}
fun sort(){
    var lowest= arrayOf(41,5,16,7,8)

       println(lowest.sortedArray().contentToString())

}
fun filter(){
    var greeting=" Hello name"
    println(greeting.trim())
}
fun namesis(){
    var names:Array<String> =arrayOf("Jim","John","Jenny","Jamie")
for (i in names.indices) {
    println("Index: $i Element: ${names[i]}")
}
}
fun boolen(){
    println("2>1 is ${2>1}")

}
fun namesOf(namy:Array<String>){

  for (i in namy)  {
println("Index: $i Element: ${namy[0]}")
  }
}
//Given an array of numbers, return a new array that has only the numbers that are 5 or greater.
       //input
//array of numbers
//Array<Int>
      //output
//a new array that are 5 or greater than 5
      //process
//loop through the array to find numbers greater than 5
fun numbers(num4:Array<Int>):Array<Int>{
    for (i in num4) {
        if (i >= 5) {
            println(i)
        }
    }
    return num4
}
//Given an array of numbers, return a new array that only includes the even numbers.
//
        //input
//array<numbers>
        //output
//return  even numbers
       //process
//loop through the array to find even numbers
fun numbersArray(num5:Array<Int>):Array<Int>{
    for (i in num5){
        if (i%2==0){
           println(i)
        }
    }
    return num5
}
//Given an array of strings, return a new array that only includes those that are 5 characters or fewer in length

     //input
//array<String>
     //output
//return a new array includes 5 character or fewer in length
     //process
//find the length of the string
//loop through the string to return a string that has 5 characters


//fun trying(namesy:Array<String>):String{
//    for (i in namesy){
//        if (i.length<=5){
//            println(i)
//    }
//         return namesy
//}
//}

fun whil(){
    var i=5
   outer@ do {
        println(++i)
//        continue
        var j=0
        while (j <5){
            println("---$j")
            j++
            break@outer

    }
        println("i am not printed")
    }
    while (i< 5)
}
           //    Morning Quiz
//Movie tickets are typically priced differently based on the age of moviegoers.
//A children's ticket price of $15 for people 12 years old or younger.
//A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
//A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
//A  -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.
//Write a Kotlin program to calculate the age-based ticket prices.

    // input
//ages
// ticket prices
     //output
//age based on ticket
//process
//creating a function that takes in a two parameter
//using if or else to loop through the ages
fun agePrice(age:Int){
    val c=Calendar.getInstance()
        val day=c.get(Calendar.DAY_OF_MONTH)

    if (day==2){
        when(age){
            in 0..12-> println("$15")
            in 13..60-> println("$25")
            in 20..61-> println("$20")
            else-> println(-1)
        }

    }
        else{
            when(age){
                in 0..12-> println("$15")
                in 13..60-> println("$30")
                in 20..61-> println("$20")
                else-> println(-1)
            }
    }

}
//Create a class called Person with properties for name and age. Write a method called speak that prints "Hello, my name is {name} and I am {age} years old."
     //input
//a class with two attribute: name & age
     //output
//name and age
    //process
//first create a class with two attributes
//create a function called method
class Person(var name:String,var age:Int){
    fun speak(){
        println("Hello, my name is $name and I am $age years old.")
    }
}
//Create a data class called User with properties for username and password. Write a method called validatePassword that checks if the password contains at least one uppercase letter, one lowercase letter, and one number.
         //input
//data class with two properties:username &password
         //output
//uppercase lowercase and one number

//data class User(var username:String,var password:Any)
// fun validatePassword(){

// }


//Create a class called Vehicle with properties for make, model, and year. Write a method called start that prints "The {make} {model} is starting up."
        //input
//create A CLASS called vehicle
           //output
//print model and make
         //   process
//create  a class
//create function
//print the make and model
 open class Vehicle(var make: String,var model: String,var year:Int){
 open fun start(){
        println("The $make $model is  starting up")
    }
}
//Create a class called Car that extends Vehicle and adds a property for color. Override the start method to print "The {color} {make} {model} is starting up
class Carr(make:String,model: String,year:Int,var color: String):Vehicle(make,model,year){
    override fun start() {
        println()
    }
}

//Create a class called Rectangle with properties for width and height. Write a method called area that returns the area of the rectangle.

class Rectangle(var width:Double,var height:Double){
    fun area():Double{
        return width*height

    }
}


//Create a data class called Point with properties for x and y. Write a method called distance that takes another Point as an argument and returns the Euclidean distance between the two points.
data class Point(var x:Double,var y:Double)
fun distance(Point:Point){

}