fun main() {
odd()
    println(namesLength())
    robot(5)
    robot(45)
    robot(12)
    number()
}
fun odd(){
    for (num in 1..100)
        if (num%2!=0){
        println(num)
    }
}
fun namesLength():Int {
    val names = arrayOf("Janet", "Estherr", "Tom", "Sara", "Peruth")
   var count=0
    for (x in names)
        if (x.length>5){
            count++
        }
    return count

    }
fun robot(guestAge:Int){
if (guestAge<6){
    println("a glass of milk")
}
    else if (guestAge<16 && guestAge>6){
        println("fanta orange.")
    }
    else {
        println("coca cola.")
    }
}
fun number(){
    for (num in 1..100)
        if (num%3==0 && num%5!==0){
            println("fizz")
        }
    else if (num%5==0 && num%3!==0){
        println("Buzz")
        }
    else if (num%5==0 && num%3==0){
        println("Fizzbuzz")
        }
    else {
        println(num)
        }
}
