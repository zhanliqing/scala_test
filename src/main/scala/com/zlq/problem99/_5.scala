package com.zlq.problem99

/**
  * Created by liqing.zhan on 2016/6/13.
  */
object _5 {
    def main(args: Array[String]) {

    }

    def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

    def reverse1[A](ls: List[A]): List[A] = {
        ls match {
            case Nil => Nil
            case head :: tail => reverse1(tail) ::: List(head)
        }

    }

    def reverseTailRecursive[A](ls: List[A]): List[A] = {
        def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
            case Nil => result
            case h :: tail => reverseR(h :: result, tail)
        }
        reverseR(Nil, ls)
    }

    def reverseFunctional[A](ls: List[A]): List[A] =
        ls.foldLeft(List[A]()) { (r, h) => h :: r }
}
