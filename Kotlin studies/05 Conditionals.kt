fun main(){

    // if , else if , else conditionals
    // if (boolean expression) - do shit
    var name = "arjun"

    if (name=="govind") {
        println("random , idiot")
    }

    else if (name == "arjun"){
        println("nerd , the analyst")
    }

    else if (name == "rishi"){
        println("silent , limited social energy")
    }

    else {
        println("need to know person more")
    }

    // switch statements
    // if value - do shit
    when(name){
        "govind" -> {
            println("random , idiot")
        }

        "arjun" -> {
            println("nerd , the analyst")
        }

        "rishi" -> {
            println("silent , limited social energy")
        }

        else {
            println("need to know person more")
        }
    }
}