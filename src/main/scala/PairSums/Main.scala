package PairSums

import scala.annotation.tailrec

object Main {
  @tailrec
  def numberOfWays(arr: Array[Int], k: Int, runningSum: Int = 0): Int = {
    if (arr.length < 2) runningSum
    else numberOfWays(arr.tail, k, runningSum + arr.tail.count(x => arr.head + x == k))
  }
}
