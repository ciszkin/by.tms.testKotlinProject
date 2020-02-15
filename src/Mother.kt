open class Mother(name: String, age: Int, sex: Sex) : Woman(name, age, sex) {
    var hasChildren: Boolean? = null

    constructor(name: String, age: Int, sex: Sex, hobby: String) : this(name, age, sex) {
        this.hobby = hobby
    }

    constructor(name: String, age: Int, sex: Sex, hobby: String, hasChildren: Boolean) : this(name, age, sex, hobby) {
        this.hasChildren = hasChildren
    }

    override fun say() {
        println("My name is $name and I'm $age years old. My hobby is $hobby. I have ${if(hasChildren == true) "" else "not"} children.")
    }
}