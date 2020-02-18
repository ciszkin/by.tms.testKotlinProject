open class Woman(override var name: String, override var age: Int, override val sex: Sex) : Human {
    var hobby: String? = null

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