package RotationalCipher

import org.scalatest.flatspec.AnyFlatSpec

class MainTest extends AnyFlatSpec {
  behavior of "rotationalCipher"
  it should "handle the examples" in {
    assert(Main.rotationalCipher("Zebra-493?", 3) == "Cheud-726?")
    assert(Main.rotationalCipher("abcdefghijklmNOPQRSTUVWXYZ0123456789", 39) == "nopqrstuvwxyzABCDEFGHIJKLM9012345678")
  }
}
