package com.zlq._13

/**
  * Created by liqing.zhan on 2016/6/11.
  */
object _1 {
    def name(): Unit = {
        println(_1.getClass.getName)
    }

    def main(args: Array[String]) {
        f1._1.name()
        f1.f2._1.name()

        import f1.{_1 => a1}
        a1.name()
        _1.name()
    }
}

package f1 {

    package f2 {

        object _1 {
            def name(): Unit = {
                println(_1.getClass.getName)
            }
        }

    }

    object _1 {
        def name(): Unit = {
            println(_1.getClass.getName)
        }
    }

}