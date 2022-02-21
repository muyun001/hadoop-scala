package chapter06

class Person00 {
  val name: String = "person"

  def hello(): Unit = {
    println("hello person")
  }
}

class Teacher00 extends Person00 {
  override val name: String = "teacher"

  override def hello(): Unit = {
    println("hello teacher")
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val teacher: Teacher00 = new Teacher00()
    val teacher1: Person00 = new Teacher00
    println(teacher.name)  // teacher
    teacher.hello()  // hello teacher
    println(teacher1.name)  // teacher
    teacher1.hello()// hello teacher
  }
}