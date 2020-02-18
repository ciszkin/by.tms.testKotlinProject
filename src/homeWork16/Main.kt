package homeWork16

import java.lang.StringBuilder

class Main {
}

fun main() {
    println(checkEnvelopes(1, 3, 7, 2))
    println(sumOfEvenNumbers())
    println(factorial(10))
    println(getBoolean(7))
}

fun calculate(a: Int, b: Int) : Int {
    return if(a%2 == 0) a*b else a + b
}

fun max(a: Int, b: Int, c: Int) : Int {
    return if(a*b*c >= a + b + c) a*b*c else a + b + c
}

fun getRank(score: Int) : String {
    return when(score) {
        in 0..19 -> "F"
        in 20..39 -> "E"
        in 40..59 -> "D"
        in 60..74 -> "C"
        in 75..89 -> "B"
        in 90..100 -> "A"
        else -> "Wrong input!"
    }
}

fun checkEnvelopes(a: Int, b: Int, c: Int, d: Int) : Boolean {
    return when{
        kotlin.math.max(a,b) > kotlin.math.max(c, d) -> kotlin.math.min(a, b) > kotlin.math.min(c, d)
        kotlin.math.max(a,b) < kotlin.math.max(c, d) -> kotlin.math.min(c, d) > kotlin.math.min(a, b)
        else -> false
    }
}

fun sumOfEvenNumbers() : Int {
    var sum = 0
    for(n in 2..99 step 2) {
        sum += n
    }
    return sum
}

fun factorial(n: Int) : Long {
    var answer = 1L
    for (i in 1..n) {
        answer *= i
    }
    return answer
}

fun getBoolean(n: Int) : String {
    val answer = StringBuilder()
    var divN = n
    while(divN > 0) {
        val reminder = divN%2
        divN /= 2
        answer.insert(0,reminder)
    }
    return answer.toString()
}