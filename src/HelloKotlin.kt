fun main() {
    //print("sum of 3 and 5 is ${sum(3,5)}")
    //println(printSum(-3,5))

    //read-only
    val a: Int = 1
    var x = 2
    if (x<5){
        x = 999
    }
    println("x = $x; a = $a")


}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum2(a: Int, b :Int) = a + b

//Function returning no meaningful value:
fun printSum(a: Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

