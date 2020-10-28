fun main() {
    println("input first num:")
    var num1str = readLine()
    println("input second num:")
    var nun2str = readLine()

    try {

        var num1 = num1str!!.toInt()
        var num2 = nun2str!!.toInt()

        println("${num1}+${num2} = ${num1 + num2}")
    }catch (e: Exception){
        println("please input numbers")
    }

}