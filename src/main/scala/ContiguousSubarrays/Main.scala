package ContiguousSubarrays

object Main {
  def countSubarrays(arr: Array[Int]): Array[Int] = {
    val result = new Array[Int](arr.length)
    arr.indices.foreach(i => {
      var count = 0
      var curIdx = i
      while (curIdx >= 0 && arr(curIdx) <= arr(i)) {
        count += 1
        curIdx -= 1
      }
      curIdx = i + 1
      while (curIdx < arr.length && arr(curIdx) <= arr(i)) {
        count += 1
        curIdx += 1
      }
      result(i) = count
    })
    result
  }
}
