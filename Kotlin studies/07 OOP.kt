// OOP is basically imo a style of programming in which everything can be represented basically in a structred way
// a way of organising information and representing them and manipulating them

// OOP basically invovled classes and objects in its core
// a class is basically what describes what something is and what properties it can have and what are the things it can do and can be done on them (blueprint)
// an object is basically a instance of class , something which is made using the details described in the class

// example lets say humans are a class and lets say its has properties like IQ , EQ , Attractiveness , etc . and it can do certain functions that is exclusive to humans like speak
// and lets say govind and giri are 2 such humans with some values given to these properties
// we use classes and objects to represent this irl information programatically 

// class humans with attributes IQ , EQ & Methods (functions which are meant to be used only on objects of the same class)
// we will the make 2 objects giri and govind and when initialising these 2 objects (creating them basically) , we can give the attributes the value we want to

// a peoper programatic example is below

class Humans (var name : String = "Joe",var age : Int = 1, var iq : Int = 50 ) { // this is how u define parameters needed , u can write classes without no parameters , and just as a way tp organise different functions as methods

    var eq = iq*(age/10)

    fun speak(){
        println("hey I am "+ name)
    }
}

fun main(){
    var mriiki = Humans("Mrinal",18,99) // when we construct an object , we are calling a constructior basically which passes the values we pass in to make an object based on the class
    mriiki.speak() // class method , works only on objects of Humans class
    println(mriiki.eq)
    println(mriiki.iq) // accessing a attribute directly

    var person = Humans()
    person.speak()

}

// in all modern languages everything is built around OOP , there are a few core types defined , everything else is derived from a class and derived into objects . Everything is an object