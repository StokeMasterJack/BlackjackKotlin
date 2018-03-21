package examplets.nullHandling

import kotlin.test.Test

/**
 * Purpose:
 *  1. Safety
 *  2. Self documenting
 *  3. Syntax shortcuts
 *
 *  ?.   safe access operator
 *  ?:   elvis operator
 *  !!   not-null assertion operator
 *
 *  Cast: as
 *  Smart Cast
 */
class NullTest {

    @Test
    fun test() {
//        val s1: String = "abc"
//        val s2: String = null
//        val s3: String? = "xyz"
//        val s4: String? = null

//    f4("Foo")
//    f4(null)

    }

    //Safe Access operator: ?.
    fun f1(s: String?) {
//    val x:Int? = if (s != null) s.length else null
        val x: Int? = s?.length
        println(x)
    }

    //Elvis operator: ?:
    fun f2(s: String?) {
//    val x:String = if (s != null) s else "No Value Provided"
        val x: String = s ?: "No Value Provided"
        println(x)
    }

    //Safe Access operator + Elvis Operator
    fun f3(s: String?) {
//    val x = if (s != null) s.length else 0
        val x = s?.length ?: 0
        println(x)
    }

    fun f4(s: String?) {
//    val x: String = if (s != null) s else throw NullPointerException()
        val x = s!!
        println(x)
    }

    fun f5(s: String?) {
        val x = s!!.length
        println(x)
    }

    @Test
    fun testLegacy() {
        val x1: Int = Foo.m1(4).length
        //val x2: Int = Foo.m1(10).length
        println(x1)
    }


}
