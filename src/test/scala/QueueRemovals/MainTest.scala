package QueueRemovals

import org.scalatest.flatspec.AnyFlatSpec

class MainTest extends AnyFlatSpec {

  behavior of "MainTest"

  it should "findPositions" in {
    assert(Main.findPositions(Array(1, 2, 2, 3, 4, 5), 5) === Array(5, 6, 4, 1, 2))
  }

}
