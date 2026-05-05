object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(59, 89, 11, 6, 9)
    assert(Policy.score(signalcase_1) == 176)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(74, 104, 15, 6, 6)
    assert(Policy.score(signalcase_2) == 204)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(66, 73, 15, 14, 12)
    assert(Policy.score(signalcase_3) == 127)
    assert(Policy.classify(signalcase_3) == "review")
  }
}
