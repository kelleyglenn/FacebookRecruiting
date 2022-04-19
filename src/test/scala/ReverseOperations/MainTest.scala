package ReverseOperations

import org.scalatest.flatspec.AnyFlatSpec

class MainTest extends AnyFlatSpec {

  behavior of "MainTest"

  it should "reverse" in {
    val input = Node(1, Node(2, Node(8, Node(9, Node(12, Node(16, null))))))
    val expected = Node(1, Node(8, Node(2, Node(9, Node(16, Node(12, null))))))
    assert(Main.reverse(input) == expected)
  }

  it should "reverseHeadToTail" in {
    val tail = Node(2, null)
    val head = Node(1, tail)
    assert(Main.reverseHeadToTail(head, head) == Node(1, Node(2, null)))
    assert(Main.reverseHeadToTail(head, tail) == Node(2, Node(1, null)))
    val tail1 = Node(2, null)
    val head1 = Node(1, tail1)
    assert(Main.reverseHeadToTail(head1, null) == Node(2, Node(1, null)))
    val tail2 = Node(3, Node(4, null))
    val head2 = Node(1, Node(2, tail2))
    assert(Main.reverseHeadToTail(head2.next, tail2) == Node(3, Node(2, Node(4, null))))
  }

}
