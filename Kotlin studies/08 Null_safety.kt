// In type specified variables u are not allowed to store Null values , this allows us to avoid a lot of run time check to see if things are working as we want it to be and
// to avoid a lot of blackswan events (or bugs ig)

// so yeah by default u cant have nulls assigned to variables , as a safety measure

// but in case u need to have nullabel objects u just need to put a `?` before the asignment operator

var a : String = null // this will drop an error
var a : String? = null // this will not drop an error since now a is nullable string
