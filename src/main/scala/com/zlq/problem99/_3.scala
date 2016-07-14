package com.zlq.problem99

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _3 {
    def main(args: Array[String]) {
        val t = List.range(1, 10)
        println(getN(3, t))
        println(getN1(3, t))
    }

    def getN[A](n: Int, ls: List[A]): A = {
        ls(n)
    }

    def getN1[A](n: Int, ls: List[A]): A = {
        if (n > 0) getN1(n - 1, ls.tail)
        else ls.head
    }

    def getN2[A](n: Int, ls: List[A]): A = (n, ls) match {
        case (0, h :: _) => h
        case (n, _ :: tail) => getN2(n - 1, tail)
        case (_, Nil) => throw new NoSuchElementException
    }

}
