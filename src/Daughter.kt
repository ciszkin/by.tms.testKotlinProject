class Daughter(name: String, age: Int, sex: Sex, hobby: String, hasChildren: Boolean) :
    Mother(name, age, sex, hobby, hasChildren) {

    override fun say() {
        println("I am daughter.")
        super.say()
    }
}