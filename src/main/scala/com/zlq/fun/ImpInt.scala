package com.zlq.fun

import java.io.File

import scala.io.Source

/**
  * Created by liqing.zhan on 2016/6/23.
  */

object ImpIntTest {

    import ImpIntTest.ImpInt

    def main(args: Array[String]) {
        println(1 add)
        println(new File("d://abc/a.txt") read)
    }

    implicit class ImpInt(i: Int) {
        def add(): Int = i + 100
    }

    implicit class FileEnhance(file: File) {
        def read() = Source.fromFile(file.getPath).getLines().mkString(",")
    }

}

