package chapter09plus

/**
 * 隐式转换可以在不需改任何代码的情况下，扩展某个类的功能。
 */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {

    val new12 = new MyRichInt(12)
    println(new12.myMax(15))

    // 1. 隐式函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

    println(12.myMax(16))

    println("============================")

    // 2. 隐式类
    implicit class MyRichInt2(val i: Int) {
      // 自定义比较大小的方法
      def myMax2(n: Int): Int = if ( n < i ) i else n
      def myMin2(n: Int): Int = if ( n < i ) n else i
    }

    println(12.myMin2(15))

    println("============================")

    // 3. 隐式参数

    implicit val str: String = "alice"
//    implicit val str2: String = "alice2"
    implicit val num: Int = 18

    def sayHello()(implicit name: String): Unit = {
      println("hello, " + name)
    }
    def sayHi(implicit name: String = "atguigu"): Unit = {
      println("hi, " + name)
    }
    sayHello
    sayHi

    // 简便写法
    def hiAge(): Unit = {
      println("hi, " + implicitly[Int])
    }
    hiAge()
  }
}

// 自定义类
class MyRichInt(val i: Int) {
  // 自定义比较大小的方法
  def myMax(n: Int): Int = if ( n < i ) i else n
  def myMin(n: Int): Int = if ( n < i ) n else i
}
