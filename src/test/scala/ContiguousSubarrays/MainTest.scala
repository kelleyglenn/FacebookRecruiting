package ContiguousSubarrays

import org.scalatest.flatspec.AnyFlatSpec

import scala.util.Random

class MainTest extends AnyFlatSpec {

  behavior of "MainTest"
  it should "handle the example" in {
    assert(Main.countSubarrays(Array(3, 4, 1, 6, 2)) === Array(1, 3, 1, 5, 1))
  }
  it should "be performant" in {
    val input = Array.fill(1000000) {
      Random.nextInt(1000000)
    }
    assert(Main.countSubarrays(input).length == 1000000)
  }
}
