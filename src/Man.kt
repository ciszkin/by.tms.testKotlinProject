open class Man(override var name: String, override var age: Int, override val sex: Sex) : Human {
    var occupation: String? = null

    override fun say() {

    }

    override fun eat() {

    }

    override fun work() {

    }

    override fun toString(): String {
        return "$name $age"
    }
}