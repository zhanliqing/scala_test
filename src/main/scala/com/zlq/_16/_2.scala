package com.zlq._16

/**
  * Created by liqing.zhan on 2016/6/10.
  */
object _2 {
    def main(args: Array[String]) {
        val l1 = List.range(1, 5)
        val l2 = List.range(5, 10)
        println(l1 ::: l2)
        println(l2.length + "---" + l2.isEmpty)
        println(l1.head + "--" + l1.tail + "--" + l1.init + "--" + l1.last)
        println(l1.reverse)
        println(l1.take(2) + "--" + l1.drop(1) + "--" + l1.splitAt(2))
        println(l1.apply(2) + "--" + l1(2))
        println(l1.indices)
        println(l1.zip(l2))
        println(l1.zip(l1.indices) + "--" + l1.zipWithIndex)
    }
}
