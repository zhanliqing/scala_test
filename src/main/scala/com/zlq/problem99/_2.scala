package com.zlq.problem99

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _2 {
    def main(args: Array[String]) {
        val t = List.range(1, 10)
        println(lastButOne(t))
        println(lastButOne1(t))
        println(lastButOne2(t))
        println(lastButOne3(2, t))
    }

    def lastButOne[A](ls: List[A]): A = {
        ls.init.last
    }

    def lastButOne1[A](ls: List[A]): A = {
        ls match {
            case l :: _ :: Nil => l
            case _ :: last => lastButOne1(last)
            case _ => throw new NoSuchElementException
        }
    }

    def lastButOne2[A](ls: List[A]): A = {
        ls.takeRight(2).head
    }

    def lastButOne3[A](n: Int, ls: List[A]): A = {
        def lastNthR(count: Int, resultList: List[A], curList: List[A]): A =
            curList match {
                case Nil if count > 0 => throw new NoSuchElementException
                case Nil => resultList.head
                case _ :: tail =>
                    lastNthR(count - 1,
                        if (count > 0) resultList else resultList.tail,
                        tail)
            }
        if (n <= 0) throw new IllegalArgumentException
        else lastNthR(n, ls, ls)
    }
}
