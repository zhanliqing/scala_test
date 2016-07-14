package com.qunar.fun

/**
  * Created by liqing.zhan on 2016/6/27.
  */
object Math_t {
    def main(args: Array[String]) {
        println(math.log1p(math.exp(1)))
        println(math.log1p(0))


        val a1 = Array((1, 11), (2, 21), (3, 31))
        a1.unzip._1.foreach(print)
        println()
        a1.unzip._2.foreach(print)
    }
}
