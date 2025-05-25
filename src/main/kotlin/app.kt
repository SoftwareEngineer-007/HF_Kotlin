package org.example

fun main() {

    var x = 1
    println("Before the loop X = $x")
    while (x < 4) {
        println("In the loop X = $x")
        x = x + 1
    }

    println("After the loop X = $x")

}