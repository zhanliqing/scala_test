package com.qunar._19

/**
  * Created by liqing.zhan on 2016/6/13.
  */
trait Queue2[T] {
    def head: T

    def tail: Queue2[T]

    def append(t: T)
}


object Queue2 {

    class Queue2Impl[T](private val leading: List[T],
                        private val trailing: List[T]) extends Queue2[T] {
        private def mirror =
            if (leading.isEmpty)
                new Queue2Impl[T](trailing.reverse, Nil)
            else
                this

        override def head: T = mirror.leading.head

        override def tail = {
            val q = mirror
            new Queue2Impl[T](q.leading.tail, q.trailing)
        }

        override def append(t: T) = new Queue2Impl[T](leading, t :: trailing)
    }

    def apply[T](xs: T*) = new Queue2Impl[T](xs.toList, Nil)
}

object TestQueue2 {
    def main(args: Array[String]) {
        val q: Queue2[Int] = Queue2(1, 2, 3, 4)
        println(q.head)
        println(q.tail)
    }
}

