package org.example

fun main() {
/*
    val x = 4
    val y = 1
    println (if (x > y) "x is greater than y" else "x is not greater than y")
    println("this line runs no matter what")
*/

    var a = 1
    while (a < 3) {
        print(if (a == 1) "Yab" else "Dab")
        print("ba")
        a = a + 1
    }
    if (a == 3) println("Do")
}