
fun main(){
    // even tho statically typed , kotlin has type inference

    var mriiki = "hooman" // this is inferred as a string by kotlin itself

    var alef : String = "wifu gun" // this is the standard way of defining static types in kotlin

    // while values inside variables can be changes , to make it a constant u can use the val keyword instead of var
    // var is mutable and val is immmutable
    val simp : String = "Violetto"
    val sixty_nine = 69

    print("$simp is $alef ~"+ mriiki + sixty_nine) // kotlin can do concatenation and string interpolation


    /* btw u can do block comments
    inside kotlin just like in dart
    ~ just saying alr */


    // data types
    // kotlin has almost all the standard data types

    var age: Int = 20 
    var phoneNo : Long = 4209642069 // long is just more storage space
    var name : String = "GDSC"
    var karaktar : Char = 'a' // single characters are represented by single quotes only
   	var boolval : Boolean = true
    var cm : Float = 29.12
    var length: Double = 225.1234 // samw as long , an extension of float with more space

    // Note: All data types are objects and have the first letter as capital

    // kotlin also has arrays sets and maps , but these are not native datatypes i think and are implemented in the standard library as classes
    // (refer derivived vs fundamental datatypes)
    // fun fact : string is also a derived datatype (i think it is built ontop of char)


    // arrays
    var a = arrayOf(1,2,3,"abc",true)
    println(a) // printing a would just give the object itself as a doesnt return anything
    println(a[2]) // individual values can be accessed via indexes tho

    a[2] = 9
    println(a[2])

    var b = arrayOf<Int>(1,2,3) // this locks the array to hold only integers
    print(b)

    // btw while u can change the values inside a array , the memory location is fixed and the list is immutable in the sense that u cant add more elements to it
    // there is a mutable array class tho that u can use for this
    // sets and maps are also implemented in kotlin like different classes similar to arrays

}
