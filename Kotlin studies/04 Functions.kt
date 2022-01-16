// functions

// this is the simplest way to define a function , no args no returns , executes the block defined in it
fun yesprinter(){
    println("/nYES")
    println("\t ~ Jotaro/n")
}

// functions with parameters
fun sums(a:Int,b:Int){
    println(a+b)
}

// function with parameters and return
fun summers(a:Int,b:Int) : Int{
    return(a+b)
}

// you need to define types for arguments and return
// i think by default functions are defined to take Unit (equivalent to void in java) , so as to not allow any other data to be entered

fun main(){
    yesprinter()
    sums(2,3)
    println(summers(2,3))
}