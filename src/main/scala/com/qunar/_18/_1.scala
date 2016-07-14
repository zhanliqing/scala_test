package com.qunar._18

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _1 {
    def main(args: Array[String]) {
        val t: Time = new Time
        t.hour_=(12)
        println(t)

    }
}

class Time {
    var hour: Int = 0
    var minute: Int = 10
    var second: Int = 19
}