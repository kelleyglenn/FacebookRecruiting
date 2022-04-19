package MinimizingPermutations

import org.scalatest.flatspec.AnyFlatSpec

class MainTest extends AnyFlatSpec {

  behavior of "MainTest"

  it should "handle example" in {
    assert(Main.minOperations(Array(3, 1, 2)) == 2)
  }
  it should "handle custom tests" in {
    assert(Main.minOperations(Array(1)) == 0)
    assert(Main.minOperations(Array(1, 2)) == 0)
    assert(Main.minOperations(Array(2, 1)) == 1)
  }
  it should "be performant" in {
    assert(Main.minOperations(Array(6, 2, 8, 3, 1, 7, 5, 4)) == 5)
  }

}
