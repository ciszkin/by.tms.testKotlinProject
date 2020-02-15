class Son(name: String, age: Int, sex: Sex, occupation: String, hasFamily: Boolean) :
    Father(name, age, sex, occupation, hasFamily) {

    override fun say() {
        println("I am son.")
        super.say()
    }
}