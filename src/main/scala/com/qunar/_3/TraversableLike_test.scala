package com.qunar._3

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object TraversableLike_test {
    def main(args: Array[String]) {
        //        testPartition
        testSeq()
    }


    def testSeq(): Unit = {
        val l1 = List.range(1, 10)
        println(l1.seq)
        println(l1.toIndexedSeq)
    }

    def testPartition(): Unit = {
        val a1 = Array(1, 2, 3, 4, 5)
        val (s, b) = a1.partition(_ > 3)
        s.foreach(print)
        println()
        b.foreach(print)
    }
}
