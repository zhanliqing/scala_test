package com.qunar._16

/**
  * Created by liqing.zhan on 2016/6/10.
  */
object _3 {
    def main(args: Array[String]) {
        val l1 = List.range(1, 10)
        println(l1.reduce(_ + _))
        println((0 /: l1) (_ + _))
        println((1 /: l1) (_ * _))
        println(1 :: List(1, 2, 3))
        println((List[Int]() /: l1) ((x, y) => {
            print(x)
            println(y)
            y :: x
        }))
        println(l1.foldLeft(0)(_ + _))

    }
}
