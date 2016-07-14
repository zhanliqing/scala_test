package com.zlq._19

/**
  * Created by liqing.zhan on 2016/6/13.
  */
class Queue1[T] private(
                         private val leading: List[T],
                         private val trailing: List[T]
                       ) {

    private def mirror =
        if (leading.isEmpty)
            new Queue1[T](trailing.reverse, Nil)
        else
            this

    def head: T = mirror.leading.head

    def tail = {
        val q = mirror
        new Queue1[T](q.leading.tail, q.trailing)
    }

    def append(t: T) = new Queue1[T](leading, t :: trailing)

    def this(elem: T*) = this(elem.toList, Nil)
}

object Queue1 {
    def apply[T](xs: T*) = new Queue1[T](xs.toList, Nil)
}