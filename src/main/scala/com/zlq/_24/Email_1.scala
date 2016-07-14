package com.zlq._24

/**
  * Created by liqing.zhan on 2016/7/15.
  */
object Email_1 {
    def apply(user: String, domain: String) = user + "@" + domain

    def unapply(email: String): Option[(String, String)] = {
        val sp = email.split("@")
        if (sp.length == 2)
            Some(sp(0), sp(1))
        else None
    }

    def main(args: Array[String]) {
        //        val email = "abc@cde.com"
        //        val email = Email_1("abc", "cde.com")
        val email = "abc"
        //        val Email_1(user, domain) = email

        email match {
            case Email_1(user, domain) => {
                println(user)
                println(domain)
            }
            case _ => println("null")
        }

        //        println(user)
        //        println(domain)
    }
}
