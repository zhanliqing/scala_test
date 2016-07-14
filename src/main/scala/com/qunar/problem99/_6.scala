package com.qunar.problem99

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _6 {
    def main(args: Array[String]) {
        val l1 = List.range(1, 4)
        val l2 = List.range(2, 0, -1)
        val l3 = l1 ::: l2
        println(l3 == l3.reverse)
    }
}
