package RotationalCipher

object Main {
  def rotationalCipher(input: String, rotationFactor: Int): String = {
    val alphaCount = 26
    val digitCount = 10
    val effectiveAlphaRot = rotationFactor % alphaCount
    val effectiveDigitRot = rotationFactor % digitCount
    input.map {
      case c if c >= 'a' && c <= 'z' => (((c - 'a') + effectiveAlphaRot) % alphaCount + 'a').toChar
      case c if c >= 'A' && c <= 'Z' => (((c - 'A') + effectiveAlphaRot) % alphaCount + 'A').toChar
      case c if c >= '0' && c <= '9' => (((c - '0') + effectiveDigitRot) % digitCount + '0').toChar
      case c => c
    }.mkString
  }
}
