package eu.tutorial.initialproject

fun main(){
    //1.
    //variable  declare by var and val
    // val - immutable variable
    // var - muttable variable
    var name = "sampath"
    name = "kumar"
//    print("my name is " + name)

    //2.
    // Integer Types: Byte(8 bit), Short(16 bit), Int(32 bit), Long(64 bit)
    val byte: Byte = 44
    val short: Short = 155
    val  int :Int = 1564654
    val long : Long = 11_46_498_497_899_789_897

    // Floating point number types: Float(32 bit) Double(64 bit)
    val float: Float = 13.45F
    val double: Double = 13.4864544564656

    //3.
    // boolean is used to represented logical values.
    // two possible values and false

    //boolean
    var isWinter: Boolean = true
    isWinter = false

    //characters
    val letterChar =  'h'
    val digitChar = '8'

    //string
    val team = "sgp stars"
    var firstChar = team[3]
    var lastChar = team[team.length -1]
//    print("last character " + lastChar)

    //4.
    //Arithmetic operators (+, -, *, /, %)
    var score = 12.54555455
    val score2 = 2.85665544
    var result : Double
    result = score * score2
    print(result)
}