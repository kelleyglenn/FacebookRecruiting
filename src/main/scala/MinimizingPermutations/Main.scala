package MinimizingPermutations

import scala.collection.mutable

object Main {
  def minOperations(arr: Array[Int]): Int = {
    var found: Option[Int] = None
    val toVisit: mutable.Queue[(Array[Int], Int)] = mutable.Queue((arr, 0))
    while (found.isEmpty && toVisit.nonEmpty) {
      val (curArr, curDepth): (Array[Int], Int) = toVisit.dequeue()
      if (isSorted(curArr)) found = Some(curDepth)
      else {
        curArr.indices.dropRight(1).foreach(start => {
          (start + 1 until curArr.length).foreach(end => {
            val newArr = curArr.take(start) ++ curArr.slice(start, end + 1).reverse ++ curArr.takeRight(curArr.length - end - 1)
            toVisit.enqueue((newArr, curDepth + 1))
          })
        })
      }
    }
    found.get
  }

  def isSorted(arr: Array[Int]): Boolean = {
    arr.indices.dropRight(1).forall { i => arr(i) < arr(i + 1)
    }
  }
}
