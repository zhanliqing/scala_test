package com.zlq._6

/**
  * Created by liqing.zhan on 2016/6/14.
  */
class Rational(n: Int, d: Int) {
    def this(n: Int) = this(n, 1)

    def this() = this(1)

    override def toString = this.d + this.n + ""

}
