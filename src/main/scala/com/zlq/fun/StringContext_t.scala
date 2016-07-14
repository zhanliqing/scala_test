package com.zlq.fun

/**
  * Created by liqing.zhan on 2016/6/23.
  */
object StringContext_t {
    def main(args: Array[String]) {
        val name = "zhanliqing"

        println(s"my name is $name")
        println(StringContext("my name is", " ").s(name))

        println(new StringContext("my name is", " ").s(name))

        println(s"1+1=${1 + 1}")


        val height = 1.9d
        val name1 = "James"
        println(f"$name1%s is $height%2.2f meters tall")


        /// 插值器是类型安全的。如果试图向只支持 int 的格式化串传入一个double 值，编译器则会报错。例如
        //        val height1: Double = 1.9d
        //        println(f"$height%4d")

        """raw 插值器
          |除了对字面值中的字符不做编码外，raw 插值器与 s 插值器在功能上是相同的。如下是个被处理过的字符串："""

        println(s"a\n\tb")
        println(raw"a\n\tb")
    }
}
