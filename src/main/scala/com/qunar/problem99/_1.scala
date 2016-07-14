package com.qunar.problem99

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _1 {
    def main(args: Array[String]) {
        val t = List.range(1, 10)
        println(last(t))
        println(last1(t))
        println(last2(t))
        println(last3(t))
        println(last4(t))
    }

    def last[T](lst: List[T]): T = {
        lst.last
    }

    def last1[T](lst: List[T]): T = {
        lst.reverse.head
    }

    def last2[T](lst: List[T]): T = {
        lst match {
            case l :: Nil => l
            case _ :: last => last2(last)
            case _ => throw new NoSuchElementException
        }
    }

    def last3[T](lst: List[T]): T = {
        val head = lst.head
        val tail = lst.tail
        if (!tail.isEmpty) {
            last3(tail)
        } else {
            head
        }
    }

    def last4[T](lst: List[T]): T = {
        var head = lst.head
        var tail = lst.tail
        while (!tail.isEmpty) {
            head = tail.head
            tail = tail.tail
        }
        head
    }
}
