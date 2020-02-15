open class Man(override var name: String, override var age: Int, override val sex: Sex) : Human {
    var occupation: String? = null

    override fun say() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun work() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toString(): String {
        return "$name $age"
    }
}