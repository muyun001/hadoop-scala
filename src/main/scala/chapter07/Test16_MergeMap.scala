package chapter07

import scala.collection.mutable

object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

//    println(map1 ++ map2)
    val map3 = map1.foldLeft(map2)(
      (mapA, mapB) => {
        val key = mapB._1
        val value = mapB._2
        mapA(key) = mapA.getOrElse(key, 0) + value
        mapA
      }
    )

    println(map3)
  }
}
