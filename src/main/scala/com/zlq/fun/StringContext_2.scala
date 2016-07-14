package com.zlq.fun

/**
  * Created by liqing.zhan on 2016/6/23.
  */
object StringContext_2 {
    def main(args: Array[String]) = {
        val email = "test@gmail.com,test@163.com:fakee3rerw@qq.com"
        //为StringContext添加了一个emails方法
        //见下面的 implicit class EmailHelper
        val emails = emails"测试${email}测试"
        emails.filter(!_.equals("")).foreach(println)
    }

    //email正则表达式，取自 http://tool.codeweblog.com/
    val emailR =
        """[\w!#$%&'*+/=?^_`{|}~-]+(?:\.[\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\w](?:[\w-]*[\w])?\.)+[\w](?:[\w-]*[\w])?""".r

    implicit class EmailHelper(val sc: StringContext) extends AnyVal {
        def emails(args: Any*): List[String] = {
            val strings = sc.parts.iterator
            val expressions = args.iterator
            val emails1 = (List[String]() /: strings) ((acc, elem) => {
                val mats = emailR.findAllIn(elem) mkString (",") split (",")
                acc ::: mats.toList
            })
            val emails2 = (List[String]() /: expressions) ((acc, elem) => {
                val mats = emailR.findAllIn(sc.s(elem)) mkString (",") split (",")
                acc ::: mats.toList
            })
            emails1 ::: emails2
        }
    }

}
