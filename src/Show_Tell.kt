import java.util.*

fun main(){
    var luxury= Vehicle("Mercedes_Benz","C 200","RAA 779S",0);
    luxury.start();
    println(luxury.speed);
    println(luxury.accelerate(50));
    println(luxury.decelerate(20));
    luxury.hoot();
    luxury.carName();

    //Kotlin Strings
    println(println(Arrays.toString(names("Sarah","Celine","Pamela")))) //Output
    array()
    capitalCities()
    integers()

}
//Classes and Objects
class Vehicle(var make:String,
              var model:String,
              var registrationPlate:String,
              var speed:Int){  //Primary constructor/parameters or attributes and state of object

    fun start(){
        println("Vrooom....Vroom!!!!");
    }
    fun accelerate(acceleration:Int):Int{
        speed=speed+acceleration;
        return speed
    }
    fun decelerate(deceleration:Int):Int{
        speed=speed-deceleration
        return speed
    }
    fun hoot(){
        println("beeeeeep,beeeeep!!!!")
    }
    fun carName(){       //Method ,function/behaviour of object
        println("$make $model");
    }
}
fun names(name1:String,name2:String,name3:String):Array<String>{   //Creating array of Strings
    return arrayOf(name1,name2,name3)
}
fun array(){
    var text= arrayOf(10.2,"Kay",20,true)
    println(Arrays.toString(text))
    var newElement= text.plus("Juliet") //Add new element in an array
    println(Arrays.toString(newElement))
    var set=text.set(0,"Belise") //replacing an existing element with index position 0 with a new element
    println(Arrays.toString(text))
}
fun capitalCities() {
    var cities = arrayOf("kigali", "nairobi","kampala","khartoum")
    cities.forEach {city ->     //Capitalize every first character of element in this array
        println(city.capitalize())

    }
}
fun integers() {
    var numbers = arrayOf(32, 17,4,21,8,3,9,31,7,11,15,6)
    println(numbers[3]) // Accessing item in array using its index
    var sum= numbers.get(1)+numbers.get(4) // Adding two element using their indices position
    println(sum)
    var sortedNumbers= numbers.sortedArray()     //Sorting elements in ascending order
    println(Arrays.toString(sortedNumbers))
}

