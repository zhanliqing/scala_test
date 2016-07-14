package com.qunar._19

/**
  * Created by liqing.zhan on 2016/6/13.
  */


/**
  * class Cell[+T](init: T) {
  * private[this] var current = init

  * def get = current

  * def set(x: T) {
  * current = x
  * }
  * }
  *

  * @param init
  * @tparam T
  */
//will has a compile error
class Cell[T](init: T) {
    private[this] var current = init

    def get = current

    def set(x: T) {
        current = x
    }
}
