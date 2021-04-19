open class Family(var name: String, var age: Int, var height:Int){
    fun eat(){
        println("We eat food everyday ")
    }
    open fun work(hours:Int){
        println("we work for $hours hours everyday")
    }
    fun sleep(time: Int){
        println("we sleep after $time o'clock everyday")
    }
}
class Parents(name: String, age: Int, height:Int):Family(name, age, height){
    fun love(){
        println("We love our babies ")
    }

    override fun work(hours: Int) {
        println("we work for $hours extra hours")
    }

}
class Brothers(name: String, age: Int, height:Int) :Family(name, age, height){
}
class Sisters(name: String, age: Int, height:Int):Family(name, age, height) {
  fun relationship(){
      println("open relationship")
  }
}

fun main() {
    var Sandra=Sisters("Sandra Nasasira",107,4)
    Sandra.relationship()
    Sandra.sleep(12)
    Sandra.eat()
    Sandra.work(2)
    var mother=Parents("Muka Frank",47,2)
    mother.work(5)
    mother.eat()
    mother.sleep(11)
    mother.love()
}