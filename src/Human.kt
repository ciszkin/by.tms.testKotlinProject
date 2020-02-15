interface Human {
    var name: String
    var age: Int
    val sex: Sex

    fun say()
    fun eat()
    fun work()
}

fun main() {
    val father = Father("Homer", 44, Sex.MALE, "safety inspector at the Springfield Nuclear Power Plant", true)
    val mother = Mother("Marge", 42, Sex.FEMALE, "cross-stitching", true)
    val son = Son("Bart", 10, Sex.MALE, "student", true)
    val daughter = Daughter("Lis", 8, Sex.FEMALE, "playing the saxophone", false)

    father.say()
    mother.say()
    son.say()
    daughter.say()

    val family = arrayListOf<Human>(father, mother, son, daughter)
    family.sortBy { it.age }
    family.reverse()
    //family.forEach { print("${it.name} ${it.age}, ") }
    println(family)
}