package com.zlq._16

/**
  * Created by liqing.zhan on 2016/6/10.
  */
object _1 {
    def main(args: Array[String]) {
        val fruit = List("apple", "orange", "egg")
        println(fruit.tail + "===" + fruit.head)
        println(fruit(1))
        val empyt = List()
        val lo: List[Object] = List[String]("a", "b")
        println(lo)

        val le: List[String] = List[Nothing]()
        //        val ls: List[String] = List[Object]("a")

        val fruit1 = "apple" :: "orange" :: "egg" :: Nil
        println(fruit1)

        val app :: org :: rest = fruit1
        println(app)
        println(org)
        println(rest)

        val List(a, b, c) = fruit1

        println(a)
        println(b)
        println(c)

    }
}
