package com.qunar

/**
  * Created by liqing.zhan on 2016/6/9.
  */
object List_test {
    def main(args: Array[String]) {
        val l1 = List.range(1, 10)
        println(l1.map(_ * 2))
        println(l1.flatMap(i => List.range(1, i)))
        println(l1.flatMap(i => List(i)))

        /*def f(sum: Int) = (x: Int) => x + sum
        val ff = f(0)
        println(l1.foreach(ff))*/

        var sum = 0
        def f = (x: Int) => sum += x
        l1.foreach(f)
        println(sum)
    }
}
