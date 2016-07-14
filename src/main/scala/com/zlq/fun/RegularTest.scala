package com.zlq.fun

import scala.util.matching.Regex


/**
  * Created by liqing.zhan on 2016/6/20.
  */
object RegularTest {
    def main(args: Array[String]) {
        val line = "dfdsfasljljlkk3j23uroul&dfjd&Sfjlsakd=23&uid=ddfdfdf&jfldsjla;k=dfalj&23l="

        val uidRegex = """(.*)&uid=([^&]*)(.*)""".r

        val uidRegex(head, uid, tail) = line

        println(head)
        println(uid)
        println(tail)


        val regex = new Regex("""(.*)&uid=([^&]*)(.*)""")

        val regex(head1, uid1, tail1) = line
        println(head1)
        println(uid1)
        println(tail1)

        line match {
            case regex(head1, uid1, tail1) => println(head1)
                println(uid1)
                println(tail1)
            case _ => println("NONE")
        }
    }
}
