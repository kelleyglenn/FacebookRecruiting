package PairSums

import org.scalatest.flatspec.AnyFlatSpec

import scala.util.Random

class MainTest extends AnyFlatSpec {

  behavior of "MainTest"

  it should "handle the examples" in {
    assert(Main.numberOfWays(Array(1, 2, 3, 4, 3), 6) == 2)
    assert(Main.numberOfWays(Array(1, 5, 3, 3, 3), 6) == 4)
  }
  it should "not hit a stack overflow" in {
    val input = Array.fill(100000)(Random.nextInt(1000000000))
    assert(Main.numberOfWays(input, Random.nextInt(1000000000)) > 0)
  }

}
