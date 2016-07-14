package com.qunar._3

/**
  * Created by liqing.zhan on 2016/6/12.
  */
object _1 {
    def main(args: Array[String]) {
        var kv = Map(1 -> "1", 2 -> "2")
        val kv1 = Map((1, "1"), (2, "2"))
        kv += 3 -> "3"
        println(kv.get(33))
        println(kv.get(2))
        println(kv1.get(1))
        println(kv1(1))
        //        println(kv1(33))
        println(kv1.getOrElse(3, "3e33"))

        println(kv ++ kv1)
        println(kv.get(1).get)
        println(kv1 + (12 -> "12"))
    }
}
