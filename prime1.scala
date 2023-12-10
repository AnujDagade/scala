object prime {

  def prime(num: Int): Boolean = {
    var flag = true

    for (i <- 2 to num - 1) {
      println(i)
      if (num % i == 0) flag = false
    }
    flag
  }

  def main(args: Array[String]): Unit = {
    println(prime(14))
  }
}
