fun main(){

    // WHILE LOOPS

    // classic while loop
    var i = 0 // initialising variable
    while (i<5) {
        println(i)
        i++
    } // this is an entry controlled loop , checks condition before entering the next iteration of the loop

    // do while loop
    //do while executes at least once even if condition fails
    i = 0 // resetting my initialising variable
    do {
        println(i)
        i++
    } while (i<5) // exit controlled loop : here the loop only checks the exit condition after the iteration of the loop is complete , so it does a command and check if its time to exit
    // for a entry controlled loop , it checks if it first needs to do the thing in the loop 


    // FOR LOOPS

    // for loop with in keyword
    var fruits = arrayOf("apple","mango","peach")
    for (i in fruits){
        print("$i ")
    }

    // using ranges/progression with for loop
    for (i in 10..99) { // the ranges are inclusive of both extremes
        print("$i ")
        if (i+1%10 == 0) {
            print("\n")
        }
    }

    // in can be also used to check membership inside a sequence
    if ("a" in "awardu") {
        print("yes a")
    }


    // break and continue statements ; affects the loop that it is enclosed in

    //break ; used to quit the loop
    for (i in 1..5){
        if (i == 3){
            break
        }
        print(i) // when i = 3 , this part of the code doesnt get executed and the program exits the loop
    }

    //continue ; used to skip to next iteration of the loop , skipping whatever was  part of the current iteration of the left unexecuted
    var x = 0
    while (x>5) {
        print(x)
        if (x == 3){
            continue
        }
        print(x+100) // when i = 3 , this print statement doesnt get executed for this iteration (JUST this iteration tho) since continue statement is above this statement
    }

}