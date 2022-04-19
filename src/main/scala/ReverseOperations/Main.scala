package ReverseOperations

object Main {
  def main(args: Array[String]): Unit = {}

  def reverse(head: Node): Node = {
    var justBeforeEven = head
    var newHead = head
    if (head.data % 2 == 0) {
      var lastEven = head
      while (lastEven.next != null && lastEven.next.data % 2 == 0) lastEven = lastEven.next
      reverseHeadToTail(head, lastEven)
      justBeforeEven = head.next
      newHead = lastEven
    }
    while (justBeforeEven != null && justBeforeEven.next != null) {
      while (justBeforeEven.next != null && justBeforeEven.next.data % 2 == 1) {
        justBeforeEven = justBeforeEven.next
      }
      var lastEven = justBeforeEven.next
      while (lastEven.next != null && lastEven.next.data % 2 == 0) {
        lastEven = lastEven.next
      }
      if (justBeforeEven.next != null) {
        val newSubHead = reverseHeadToTail(justBeforeEven.next, lastEven)
        val temp = justBeforeEven.next
        justBeforeEven.next = newSubHead
        justBeforeEven = temp.next
      }
    }
    newHead
  }

  def reverseHeadToTail(originalHead: Node, originalTail: Node): Node = {
    var from = originalHead
    var to = if (originalTail == null) null else originalTail.next
    val end = to
    while (from != end) {
      val temp = from.next
      from.next = to
      to = from
      from = temp
    }
    to
  }
}

case class Node(data: Int, var next: Node) {}