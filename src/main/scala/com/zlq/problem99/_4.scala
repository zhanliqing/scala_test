package com.zlq.problem99

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _4 {
    def main(args: Array[String]) {

    }

    def length[A](ls: List[A]): Int = ls.length

    def length1[A](ls: List[A]): Int = {
        ls match {
            case Nil => 0
            case _ :: tail => 1 + length1(tail)
        }
    }

    def length2[A](ls: List[A]): Int = {
        var length = 0
        while (!ls.isEmpty) {
            length += 1
        }
        length
    }
}
