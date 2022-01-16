fun main(){
     // arithmetic operators
     var a : Int = 2
     var b : Int = 3

     println(a+b)
     println(a-b)
     println(a*3.0)
     println(a/b)
     
     println(b%a) // modulo operator

     //realational operators
     println(a>b)
     println(a<b)
     println(a<=b)
     println(a==b)
     println(a!=b)

     // assignment operator
     a = 5

     a = a +2
     a += 2 // short hand for above expression
     
    // unary operator
    a++
    a-- // unary increment or decrement operator

    // boolean operator
    var t : Bool = true
    var f : Bool = false

    println(a&&b) // logical AND ; T if both T
    println(a||b) // logical OR ; T if any is T
    println(!b) // logical NOT operator ; returns opposite of input


    // Multiline string
    var multi_str : String = """h
    e
    l""" // the intendations to the left are also included in the string
    
    var raw_str = """ \n """// multi line strings are literally raw strings , escape sequence doesnt work on them

    println(multi_str)
    println(raw_str)

    // String methods

    var a_string : String = "this is a string lul"
    println(a_string[0]) // indexing individual character is possible in kotlin

    println(a_string.length) // accessing attributes for the string object stoed inside a_string
    println(a_string.lastIndex)

    println(a_string.uppercase()) // methonds defined for strings
    println(a_string.lowercase())


}