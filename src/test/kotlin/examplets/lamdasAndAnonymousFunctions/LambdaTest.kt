package examplets.lamdasAndAnonymousFunctions

import kotlin.test.Test

class LambdaTest {

    @Test
    fun testAnonymousFunctions() {

        val a = fun() {
            println(111)
        }

        val b = fun(p1: Int) = p1 * p1

        useFunctions(a, b)

        useFunctions(fun() { println(111) }, fun(p1) = p1 * p1)

    }

    @Test
    fun testLambdaFunctions() {

        val a = { println(111) }

        val b = { p1: Int -> p1 * p1 }

        val c = { p1: Int, p2: Int -> p1 * p2 }

        c(2, 3)

        useFunctions(a, b)

        useFunctions({ println(111) }, { it * it })
    }

    fun useFunctions(f1: () -> Unit, f2: (Int) -> Int) {
        f1()
        println(f2(10))
    }


}