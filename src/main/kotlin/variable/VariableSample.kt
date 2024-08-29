package variable

class VariableSample {

    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            val firstName : String = "Yoonsoo"
            val lastName = "Han"
            var age = 12

//            lastName = "Kim"
            age = 15

            println("my name is $firstName")
            println("my age is $age")
        }
    }
}