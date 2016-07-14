package com.zlq.fun

/**
  * Created by liqing.zhan on 2016/7/13.
  */
object RegularTest1 {
    def main(args: Array[String]) {
        val result = "[07 12 20:00:01]>> QueryHotelList:key=1468324800310&cid=C2075&uid=866001029492734"

        val regex = """(\[\d{2}\s\d{2}\s\d{2}:\d{2}:\d{2}\])>>\s([^:]*):(.*)""".r

        val regex(a,b,c) = result
        println(a)
        println(b)
        println(c)
    }
}
