fun main() {
   printName("yvonne")
   var v=modulus(13,2)
    println(v)
    println(add(34,67,12,90))
    println(aboutMe("I am passionate about Technology and the evolving world."))
}
    fun printName(name:String){
        var z ="Hello ${name}"
        println(z)
    }
    fun modulus(num1:Int,num2:Int):Int{
        var y = num1%num2
        return y
    }
     fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
         var result = num1 + num2 + num3 + num4
         return result
     }
     fun aboutMe(text:String):String{
         var fact = text
         return fact
     }



