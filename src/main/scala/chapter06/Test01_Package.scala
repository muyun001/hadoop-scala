package com{

  import com.atguigu.scala.Inner  //父包访问子包需要导包

  // 在外层包中定义单例对象
  object Outer{
    var aaa: String = "aaa"
    def main(args: Array[String]): Unit = {
      println(Inner.bbb)
    }
  }

  package atguigu{
    package scala{
      // 内层包中定义单例对象
      object Inner{
        var bbb: String = "bbb"
        def main(args: Array[String]): Unit = {
          println(Outer.aaa)  //子包访问父包无需导包
          Outer.aaa = "outer"
          println(Outer.aaa)
        }
      }
    }
  }
}

// 在同一文件中定义不同的包
package aaa{
  package bbb{

    object Test01_Package{
      def main(args: Array[String]): Unit = {
        import com.atguigu.scala.Inner
        println(Inner.bbb)
      }
    }
  }
}
