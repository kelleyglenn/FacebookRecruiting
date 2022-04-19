package QueueRemovals

import scala.collection.mutable

object Main {

  def main(args: Array[String]): Unit = {
    // Call findPositions() with test cases here
  }

  def findPositions(arr: Array[Int], x: Int): Array[Int] = {
    val arrWith1idx: Array[(Int, Int)] = arr.zipWithIndex.map { case (value, i) => (value, i + 1) }
    val workingQueue: mutable.Queue[(Int, Int)] = mutable.Queue(arrWith1idx: _*)
    (1 to x).map { _ =>
      val popped = (1 to Math.min(x, workingQueue.length)).map(_ => workingQueue.dequeue())
      val max = popped.maxBy(_._1)
      workingQueue.enqueue(popped.filterNot(_ == max).map { case (value, i) => (Math.max(0, value - 1), i) }: _*)
      max._2
    }.toArray
  }
}