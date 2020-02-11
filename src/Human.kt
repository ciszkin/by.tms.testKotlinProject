class Human {
    var name: String? = null

    class Student {
        var studentID: Int? = null

        fun sayID() = println("My ID is $studentID")
    }

    inner class Teacher() {
        var homeWorkID: Int? = null

        constructor(name: String?) : this() {
            this@Human.name = name
        }

        fun sayHello() = println("My name is $name")

        fun giveHomeWork() = println("Homework id is ${homeWorkID ?: 14}")
    }
}

fun main() {
    val stud = Human.Student()
    val teacher = Human().Teacher()
    //val teacher = Human().Teacher("Alex")

    stud.sayID()
    teacher.sayHello()
    teacher.giveHomeWork()
}