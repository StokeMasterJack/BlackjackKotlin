package examplets.introToClassesAndJavaInterop

fun main(args: Array<String>) {

    val p1 = Point(1, 1)
    val p2 = PointJ(2, 2)

    println(p1.x)
    println(p1.y)

    println(p2.x)
    println(p2.y)

}

