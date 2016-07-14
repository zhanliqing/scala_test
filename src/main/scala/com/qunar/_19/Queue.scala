package com.qunar._19

/**
  * Created by liqing.zhan on 2016/6/13.
  */
class Queue[T](
                private val leading: List[T],
                private val trailing: List[T]
              ) {

    private def mirror =
        if (leading.isEmpty)
            new Queue[T](trailing.reverse, Nil)
        else
            this

    def head: T = mirror.leading.head

    def tail = {
        val q = mirror
        new Queue[T](q.leading.tail, q.trailing)
    }

    def append(t: T) = new Queue[T](leading, t :: trailing)

}


object Test {
    def main(args: Array[String]): Unit = {
        val q: Queue[Int] = new Queue[Int](List(), List())
        val q1 = q.append(1)
        println(q1.head)
    }
}